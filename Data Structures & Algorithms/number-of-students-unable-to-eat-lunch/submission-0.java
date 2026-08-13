class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();

        // Copy the students into the queue
        for (int student : students) {
            queue.offer(student);
        }

        // Count total students and unableToEat sandwiches eaten
        int studentIndex = 0;
        int unableToEat = 0;

        // Loop until queue is empty or no student wants the current sandwich
        while (!queue.isEmpty() && unableToEat < queue.size()) {
            // If the student matches the current sandwich
            if (queue.peek() == sandwiches[studentIndex]) {
                queue.poll(); // remove student
                studentIndex++;
                unableToEat = 0; // reset counter
            } else {
                queue.add(queue.poll()); // move student to the end of the queue
                unableToEat++; // increment students not eating sandwich
            }
        }
        // Return the number of students that are unable to eat
        return unableToEat;
    }
}