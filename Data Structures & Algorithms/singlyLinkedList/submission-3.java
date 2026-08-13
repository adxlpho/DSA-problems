class ListNode {
    int value;
    ListNode next;

    // Constructor only accepting value and setting pointer to null
    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        ListNode current = head;
        int i = 0;

        while (current != null) {
            if (i == index) {
                return current.value;

            }
            i++;
            current = current.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public boolean remove(int index) {
        if (head == null) return false;

        if (index == 0) {
            if (head == tail) tail = null;
            head = head.next;
            return true;
        }

        ListNode current = this.head;
        int i = 0;
        while (i < index - 1 && current != null) {
            i++;
            current = current.next;
        }

        if (current != null && current.next != null) {
            if (current.next == this.tail) {
                this.tail = current;
            }
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = this.head;

        while (current != null) {
            values.add(current.value);
            current = current.next;
        }
        return values;
    }
}
