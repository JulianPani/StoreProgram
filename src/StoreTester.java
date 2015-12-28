
/*
 * Tests the Store class*/
public class StoreTester {
	public static void main(String[] args) {
		 
		Store store = new Store();
		
		// Book book1 = new Book("Peace", "Binyamin Netanyahu", 10.5);
		// Book book1 = BookTester.createSomeBook();
		
		// CD cd1 = new CD("Stairway to heaven", "Led Zeppelin", 120.99);
		
		CD cd1 = CDTester.createSomeCD();
		// store.addBook(book1);
		store.addCD(cd1);
		
		// BookTester.loadTestBooksFromFile(fileName);
		// BookTester.loadTestBookObjectsFromFile(fileName, 100);
//		for(Book book : BookTester.testBooks)
//		{
//			store.addBook(book);
//		}
		
		String booksFile="C:/Users/jbt/Desktop/Exer/TestBooks.txt";
		store.addBooksFromFileToStore(booksFile, ",");
		
		String cdsFile="C:/Users/jbt/Desktop/Exer/top_10_best_selling_90s_US.csv";
		store.addCDsFromFileToStore(cdsFile, ",");
					
		store.printAllStoreItems();
		
		// TestHelper.loadTestObjectsFromFile(fileName,", ", )
		
	}
}
