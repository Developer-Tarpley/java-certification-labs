import java.util.Scanner;

public class BooksMenu {

    private static void priceCompare(String book1, String book2){
        if(book1.getPrice() > book2.getPrice()){
            System.out.println(book1 + "is more expensive than " + book2);
        }else{
            System.out.println(book2 + "is more expensive than " + book1);
        }
    }
	public static void main(String s[]) {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		Book[] books = new Book[10];
		int bkIdx = 0;
		while(true) {
			System.out.println("Press 1 to view books, 2 to add books, any other key to exit");
			String userAction = scanner.nextLine();
			if (userAction.equals("1")) {
				for(int i=0;i<books.length;i++) {
					if(books[i] != null) {
						System.out.println(books[i]);
					}
				}
			} else if (userAction.equals("2")) {
				if(bkIdx == 10) {
					System.out.println("10 books added already. Cannot add any more books!");
					continue;
				}
				System.out.println("Enter book title");
				String tmpTitle = scanner.nextLine();
				System.out.println("Enter book author");
				String tmpAuthor = scanner.nextLine();
				System.out.println("Enter book price");
				float tmpPrice = Float.parseFloat(scanner.nextLine());
				Book bkTmp = new Book();
				bkTmp.setTitle(tmpTitle);
				bkTmp.setAuthor(tmpAuthor);
				bkTmp.setPrice(tmpPrice);
				books[bkIdx++] = bkTmp;

			} else {
				break;
			}
		}
	}
}