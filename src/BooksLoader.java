import java.util.Scanner;




public class BooksLoader extends StoreItemLoader<Book> {

	public BooksLoader(String fileName, String separator) {
		super(fileName, separator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	Book createStoreItem(String itemStoreAsCsv)
	{
    	String[] parts = itemStoreAsCsv.split(separator);
    	for (String part : parts)
    		part = part.trim();
    	Book book = new Book(parts[0], parts[1], Double.parseDouble(parts[2]));
    	// storeObjects.add(book);
    	return book;
	}

	@Override
	String getItemFromUserInput(Scanner inputScanner) {
		// TODO Auto-generated method stub
		return null;
	}
}
