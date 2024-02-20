

public class Queue<G> {
    private G[] array;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue(int capacity) {
        this.capacity = capacity;
        array = (G[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an item to the queue.
    public void enqueue(G элемент) {
        if (isFull()) {
            System.out.println("Дараалал дүүрсэн байна." + элемент);
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = элемент;
        size++;
    }

    // Method to remove an item from queue.
    public G dequeue() {
        if (isEmpty()) {
            System.out.println("Дараалал хоосон байна.");
            return null;
        }
        G элемент = array[front];
        front = (front + 1) % capacity;
        size--;
        return элемент;
    }

    // Method to get the front item from the queue without removing it.
    public G peek() {
        if (isEmpty()) {
            System.out.println("Дараалал хоосон байна. Элемент харах боломжгүй.");
            return null;
        }
        return array[front];
    }

    // Method to check if the queue is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full.
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the current size of the queue.
    public int size() {
        return size;
    }

    // Method to print the elements of the queue.
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Дараалал хоосон байна.");
            return;
        }
        
        int count = 0;
        int index = front;
        while (count < size) {
        	
        	System.out.println((count + 1) + ". " + array[index].toString());
        	
            index = (index + 1) % capacity;
            count++;
        }
        
        
        
        System.out.println();
    }
    
    public void printAllTheWayUp() {
    	if (isEmpty()) {
    		System.out.println("Дараалал хоосон байна.");
    	}
    	
    	System.out.println("Queue: ");
    	
    	for (int i = 0; i < rear; i++) {
    		System.out.print(array[i] + " ");
    	}
    	System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>(5);
        integerQueue.enqueue(1);
        integerQueue.enqueue(2);
        integerQueue.enqueue(3);
        integerQueue.enqueue(4);
        integerQueue.enqueue(5);
        
        integerQueue.printQueue();
        
        integerQueue.dequeue();
        integerQueue.dequeue();
        integerQueue.dequeue();
        integerQueue.dequeue();

        integerQueue.printQueue();
        
        integerQueue.enqueue(6);
        integerQueue.enqueue(7);
        
        integerQueue.printQueue();


        // 14:04
        // 14:27
        
    }
}

