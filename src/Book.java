


public class Book extends StoreItem {

	String author;
	
	public Book(String name, String author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;	
	}
	
	public String toString()
	{
		String separator = ", ";
		String booksAsString = "Name: " + name
						+ separator
						+ "Author: " + author
						+ separator
						+ "Price " + priceToString(price);
		return booksAsString;
	}
}
