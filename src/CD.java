


public class CD extends StoreItem {
	String band;

	public CD(String name, String band, double price) {
		this.name = name;
		this.band = band;
		this.price = price;
	}
	
	public String toString()
	{
		String separator = ", ";
		String cdAsString = "Name: " + name
						+ separator
						+ "Band: " + band
						+ separator
						+ "Price " + priceToString(price);
		return cdAsString;
	}

	
}
