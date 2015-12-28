import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TestHelper {
	
	String[][] testObjects;
	
	/**
	 * Loads a line from a file and returns its String parts
	 * @returns the line as a String array
	 * */
	public void loadTestObjectsFromFile(String fileName, String separator)
	{
		
		try {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file);
	        int lineCounter = 0;
	        
	        // Read the header first to know what is the array size (number of columns)
	        if (scanner.hasNextLine() && lineCounter == 0)
        	{
	        	String[] headerColumns = getNextRowColumns(scanner, separator);
	        	testObjects = new String[100][headerColumns.length];
	        	this.addRow(headerColumns, lineCounter);
        	}

	        while (scanner.hasNextLine()) {
	        	lineCounter++;
	        	String[] rowColumns = getNextRowColumns(scanner, separator);
	        	this.addRow(rowColumns, lineCounter);
	        }
	        scanner.close();
	      	} catch (FileNotFoundException e) {
	        e.printStackTrace();
	      }
	}
	
	private String[] getNextRowColumns(Scanner scanner, String separator)
	{
		String line = scanner.nextLine();
		String rowColumns[] = line.split(separator);
		return rowColumns;
	}
	
	private void addRow(String[] rowColumns, int lineNumber)
	{
    	for(int c=0; c<rowColumns.length;c++)
    		testObjects[lineNumber][c] = rowColumns[c];
	}
	
//	private void countLinesInFile(fileName)
//	{
//		try {
//	        File file = new File(fileName);
//	        Scanner scanner = new Scanner(file);
//	        int numberOfLines = 0;
//	        while (scanner.hasNextLine()) {
//	        	lineCounter++;
//	        	String[] rowColumns = getNextRowColumns(scanner, separator);
//	        	this.addRow(rowColumns, lineCounter);
//	        }
//	        scanner.close();
//	      	} catch (FileNotFoundException e) {
//	        e.printStackTrace();
//	      }
//	}
}
