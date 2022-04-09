package running;

import base.Book;
import java.util.*;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] bookArray = new Book[3];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String title;
		String author;
		int price;
		int pages;
		
		for (int i = 0; i < bookArray.length; i++) {
			
			/*System.out.println("Title: ");
			bookArray[i].setTitle(input.next());
			System.out.println("Author: ");
			bookArray[i].setAuthor(input.next());
			System.out.println("Price: ");
			bookArray[i].setPrice(input.nextInt());
			System.out.println("Pages: ");
			bookArray[i].setPages(input.nextInt());*/
			
			System.out.print("Title: ");
			title = input.nextLine();
			System.out.print("Author: ");
			author = input.nextLine();
			System.out.print("price: ");
			price = input.nextInt();
			System.out.print("pages: ");
			pages = input.nextInt();
			
			bookArray[i] = new Book(title, author, price, pages);
		}
		
		Book.listBookArray(bookArray);
		System.out.println("Longest book: " + Book.getLongestBook(bookArray).getTitle());
	}
	
}
