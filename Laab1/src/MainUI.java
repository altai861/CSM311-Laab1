import java.util.Scanner;
import java.util.InputMismatchException;

public class MainUI {
	public static void main(String[] args) {
		Queue<Book> main = null;
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		
		while (true) {
			if (main == null) {
				System.out.println("1. Номын дарааллыг үүсгэх.");
				
				int songolt = scanner.nextInt();
				
				if (songolt == 1) {
					System.out.println("Номын дарааллын хэмжээг оруулна уу: ");
					size = scanner.nextInt();
					main = new Queue<Book>(size);
				}
			} else {
				System.out.println("1. Ном нэмэх");
				System.out.println("2. Ном гаргах");
				System.out.println("3. Дарааллын эхэнд байгаа номыг харах");
				System.out.println("4. Дараалалд зай байгаа эсэхийг шалгах");
				System.out.println("5. Дарааллын хэмжээг харах");
				System.out.println("6. Номуудыг хэвлэх");
				System.out.println("7. Програмаас гарах");
				
				int songolt = scanner.nextInt();
				scanner.nextLine();
				if (songolt == 1) {
				    System.out.println("Номын нэр: ");
				    String bookName = scanner.nextLine();
				    
				    System.out.println("Зохиогчийн нэр: ");
				    String authorName = scanner.nextLine();
				    
				    System.out.println("Бичигдсэн он: ");
				    int year = scanner.nextInt();
				    scanner.nextLine(); // Consume newline character
				    
				    System.out.println("ISBN дугаар: ");
				    String isbn = scanner.nextLine();
				    
				    Book newBook = new Book(bookName, authorName, year, isbn);
				    main.enqueue(newBook);
				} else if (songolt == 2) {
					main.dequeue();
				} else if (songolt == 3) {
					main.peek();
				} else if (songolt == 4) {
					if (main.isFull()) {
						System.out.println("Дараалал дүүрсэн байна.");
					} else {
						System.out.println("Дараалалд зай байна.");
					}
				} else if (songolt == 5) {
					System.out.println("Дараалалд " + main.size() + " ном байна." + " Дахин " + (size - main.size()) + " ном нэмэх боломжтой.");
				
				} else if (songolt == 6) {
					main.printQueue();
				} else if (songolt == 7) {
					scanner.close();
					break;
				} else {
					System.out.println("Буруу утга оруулсан байна.");
				}
			
			}
		}
	}

}
