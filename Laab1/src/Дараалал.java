

public class Дараалал<T> {
    private T[] массив;
    private int урд;
    private int ард;
    private int дээдХэмжээ;
    private int хэмжээ;

    public Дараалал(int дээдХэмжээ) {
        this.дээдХэмжээ = дээдХэмжээ;
        массив = (T[]) new Object[дээдХэмжээ];
        урд = 0;
        ард = -1;
        хэмжээ = 0;
    }

    // Method to add an item to the queue.
    public void дараалалдНэмэх(T элемент) {
        if (дүүрэнЭсэх()) {
            System.out.println("Дараалал дүүрсэн байна." + элемент);
            return;
        }
        ард = (ард + 1) % дээдХэмжээ;
        массив[ард] = элемент;
        хэмжээ++;
    }

    // Method to remove an item from queue.
    public T дарааллаасГаргах() {
        if (хоосонЭсэх()) {
            System.out.println("Дараалал хоосон байна.");
            return null;
        }
        T элемент = массив[урд];
        урд = (урд + 1) % дээдХэмжээ;
        хэмжээ--;
        return элемент;
    }

    // Method to get the front item from the queue without removing it.
    public T шагайх() {
        if (хоосонЭсэх()) {
            System.out.println("Дараалал хоосон байна. Элемент харах боломжгүй.");
            return null;
        }
        return массив[урд];
    }

    // Method to check if the queue is empty.
    public boolean хоосонЭсэх() {
        return хэмжээ == 0;
    }

    // Method to check if the queue is full.
    public boolean дүүрэнЭсэх() {
        return хэмжээ == дээдХэмжээ;
    }

    // Method to get the current size of the queue.
    public int size() {
        return хэмжээ;
    }

    // Method to print the elements of the queue.
    public void printQueue() {
        if (хоосонЭсэх()) {
            System.out.println("Дараалал хоосон байна.");
            return;
        }
        System.out.print("Queue: ");
        int count = 0;
        int index = урд;
        while (count < хэмжээ) {
            System.out.print(массив[index] + " ");
            index = (index + 1) % дээдХэмжээ;
            count++;
        }
        
        System.out.println();
    }
    
    public void printAllTheWayUp() {
    	if (хоосонЭсэх()) {
    		System.out.println("Дараалал хоосон байна.");
    	}
    	
    	System.out.println("Queue: ");
    	
    	for (int i = 0; i < ард; i++) {
    		System.out.print(массив[i] + " ");
    	}
    	System.out.println();
    }

    public static void main(String[] args) {
        Дараалал<Integer> integerQueue = new Дараалал<>(5);
        integerQueue.дараалалдНэмэх(1);
        integerQueue.дараалалдНэмэх(2);
        integerQueue.дараалалдНэмэх(3);
        integerQueue.дараалалдНэмэх(4);
        integerQueue.дараалалдНэмэх(5);
        
        integerQueue.printQueue();
        
        integerQueue.дарааллаасГаргах();
        integerQueue.дарааллаасГаргах();
        integerQueue.дарааллаасГаргах();
        integerQueue.дарааллаасГаргах();

        integerQueue.printQueue();
        
        integerQueue.дараалалдНэмэх(6);
        integerQueue.дараалалдНэмэх(7);
        
        integerQueue.printQueue();


        

    }
}

