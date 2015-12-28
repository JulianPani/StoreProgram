
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public abstract class StoreItemLoader<ItemType> {
	String fileName;
	String separator;
	Scanner inputScanner;
	ArrayList<ItemType> storeObjects = new ArrayList<ItemType>();
	
	public StoreItemLoader(String fileName, String separator) {
		this.fileName = fileName;
		this.separator=separator;
	}
	
	public StoreItemLoader(Scanner inputScanner) {
		this.inputScanner=inputScanner;
	}
	
	public ArrayList<ItemType> loadTestObjectsFromFile(String filename, String separator)
	{
		try {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file);
	        iterateFile(scanner);
	        scanner.close();
	      	} catch (FileNotFoundException e) {
	        e.printStackTrace();
	      }
		return storeObjects;
	}
	
	private void iterateFile(Scanner scanner)
	{
		while (scanner.hasNextLine()) {
        	String line = scanner.nextLine();
        	ItemType storeItem = createStoreItem(line);
        	storeObjects.add(storeItem);     	
        }
	}
	
	abstract ItemType createStoreItem(String itemStoreAsCsv);
	// TODO: split user input into a different class, make this one exclusive to file input
	public void createStoreItemFromUserInput(String input)
	{
		
	}
	
	abstract String getItemFromUserInput(Scanner inputScanner);
}