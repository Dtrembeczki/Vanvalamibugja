package running;

import base.Book;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("Piszkos Fred a kapitány", "Rejtõ Jenõ", 1963, 2500);
		Book b2 = new Book("Harry Potter", "J.K. Rowling");
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
