package base;

public class Book {
	
	//Datas
	private String title;
	private String author;
	private int year;
	private int price;
	
	java.time.LocalDate currentDate = java.time.LocalDate.now();
	int cur_year = currentDate.getYear();
	
	public Book(String title, String author, int year, int price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.price = price;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		this.price = 2500;
		this.year = cur_year;
	}
	
	
	//myFunctions
	
	public void raisePrice(int percent) {
		this.price += this.price *(percent/100);
	}
	
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + ", price=" + price + "]";
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
	
	
	
}
