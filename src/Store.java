import java.util.ArrayList;



public class Store {
	ArrayList<CD> CDs = new ArrayList<CD>();
	ArrayList<Book> Books = new ArrayList<Book>();

	public void addCD(CD cd)
	{
	
		this.CDs.add(cd);
	}
	
	public void addBook(Book book)
	{
		
		this.Books.add(book);
	}

	public void addBooksFromFileToStore(String fileName, String separator)
	{
		ArrayList<Book> booksToLoad = new ArrayList<Book>();
		
		BooksLoader books = new BooksLoader(fileName, separator);
		booksToLoad = books.loadTestObjectsFromFile(fileName, separator);
		for(Book book : booksToLoad)
			this.addBook(book);
	}
	
	public void addCDsFromFileToStore(String fileName, String separator)
	{
		ArrayList<CD> CDsToLoad = new ArrayList<CD>();
		
		CDsLoader cdsLoader = new CDsLoader(fileName, separator);
		CDsToLoad = cdsLoader.loadTestObjectsFromFile(fileName, separator);
		for(CD cd : CDsToLoad)
			this.addCD(cd);
	}
	
	public void printAllStoreItems()
	{
		System.out.println("Welcome to my awesome store");
		System.out.println("===========================");
		this.printCDs();
		System.out.println();
		this.printBooks();
	}
	
	public void printCDs()
	{
		System.out.println("## CDs in this store:");
		for(CD cd : CDs)
			System.out.println(cd.toString());
		System.out.println("------");
	}
	
	public void printBooks()
	{
		System.out.println("## Books in this store:");
		for(Book book : Books)
			System.out.println(book.toString());
		System.out.println("------");
	}


}
