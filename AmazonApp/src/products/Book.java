package products;

public class Book {
	String title;
	String author;
	int price;

	public Book() {}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		if (price < 0) { 
			System.out.println("Nothing comes for free");
		} else {
			this.price = price;
		}
		System.out.println("Book created");
	}
	public Book(String t, String a) {
		title = t;
		author = a;
	}

}
