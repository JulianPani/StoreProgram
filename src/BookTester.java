

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class BookTester {
	
	public static ArrayList<Book> testBooks = new ArrayList<Book>();
	
	// TODO remove!
	public static void loadTestBooksFromFile(String fileName)
	{
		try {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file);
	        Book book;
	        while (scanner.hasNextLine()) {
	        	String line = scanner.nextLine();
	        	// System.out.println(line);
	        	String[] parts = line.split(", ");
	        	book = new Book(parts[0], parts[1], Double.parseDouble(parts[2]));
	        	testBooks.add(book);
	        }
	        scanner.close();
	      	} catch (FileNotFoundException e) {
	        e.printStackTrace();
	      }
	}
	
	public static void addBooksFromFileToStore(String fileName, String separator, Store store)
	{
		BooksLoader books = new BooksLoader(fileName, separator);
		testBooks = books.loadTestObjectsFromFile(fileName, separator);
		for(Book book : testBooks)
			store.addBook(book);
	}
	
	static Book createSomeBook()
	{
		Book book1 = new Book("Peace", "Binyamin Netanyahu", 10.5);
		return book1;
	}

	static Book getRandomBook()
	{
		Random rand = new Random();
		int randomIndex = rand.nextInt(testBooks.size());
		return testBooks.get(randomIndex);
	}

	static ArrayList<Book> getAllBooks()
	{
		return testBooks;
	}
	
}
