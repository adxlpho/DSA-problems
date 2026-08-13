class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> tempStack = new Stack<>();
        int min = Integer.MAX_VALUE;
        
        // keeps running until stack is empty
        while(!stack.isEmpty()) {
            int val = stack.pop();
            if (val < min) {
                min = val;
            }
            tempStack.push(val);
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return min;
    }
}
