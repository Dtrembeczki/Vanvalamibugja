package base;

public class Book {

	// Datas
	private String title;
	private String author;
	private int year;
	private int price;
	private int pages;

	java.time.LocalDate currentDate = java.time.LocalDate.now();
	int cur_year = currentDate.getYear();

	public Book(String title, String author, int price, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.year = cur_year;
		this.price = price;
		this.pages = pages;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		this.price = 2500;
		this.year = cur_year;
		this.pages = 100;
	}

	// myFunctions

	public void raisePrice(int percent) {
		this.price += this.price * (percent / 100);
	}

	// Írjon osztályszintû metódust, amely két paraméterként kapott könyv közül a
	// hosszabbat adja vissza (getLonger()). Azonos oldalszám esetén az elsõ
	// könyvet.
	public boolean getLonger(Book b1, Book b2) {
		if (b1.pages >= b2.pages) {
			return true;
		} else {
			return false;
		}
	}

	// Írjon példányszintû metódust, amely igazat ad vissza, ha a könyv oldalszáma
	// páros (hasEvenPages()).
	public boolean hasEvenPages() {
		if (this.pages % 2 == 0) {
			return true;
		}

		return false;
	}
	
	//Tomb kiiro
	public static void listBookArray(Book[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	//Leghosszabb könyv
	public static Book getLongestBook(Book[] array) {
		Book longestBook = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i].pages > longestBook.pages) {
				array[i] = longestBook;
			}
		}
		return longestBook;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", price=" + price + "Pages:" + pages + "]";
	}

	// Getters&Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {

		if (pages < 0) {
			this.pages = 0;
		} else {
			this.pages = pages;
		}
	}

}
