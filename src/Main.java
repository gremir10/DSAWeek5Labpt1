/*Let Q be a non-empty queue, and let S be an empty stack.
Write a Java program that reverses the order of the elements in Q, using S.
Make sure to include running and space complexity for your code.*/

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println("Original queue: ");
        queue.printQueue();

        Stacking stack = new Stacking(10);


        //reverse queue using empty stack
        while (!queue.isEmpty()) {
            stack.push(queue.dequeue(1));
        }

        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }
        System.out.println("Reversed queue: ");
        queue.printQueue();
    }


    }

