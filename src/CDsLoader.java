import java.util.Random;
import java.util.Scanner;

public class CDsLoader extends StoreItemLoader<CD> {

	public CDsLoader(String fileName, String separator) {
		super(fileName, separator);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	CD createStoreItem(String itemStoreAsCsv)
	{
    	Random rand = new Random();
		String[] parts = itemStoreAsCsv.split(separator);
    	CD cd = new CD(parts[0], parts[1], rand.nextInt(1000) + rand.nextDouble());
    	// storeObjects.add(book);
    	return cd;
	}

	@Override
	String getItemFromUserInput(Scanner inputScanner) {
		// TODO Auto-generated method stub
		System.out.println("Enter a new album");
		System.out.println("Name: ");
		String albumName = inputScanner.nextLine();
		System.out.println("Artist: ");
		String artist = inputScanner.nextLine();
		
		return null;
	}
}
