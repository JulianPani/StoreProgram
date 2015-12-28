import java.text.DecimalFormat;


public class StoreItem {
	String name;
	double price;
	
	static String priceToString(double price) {
		DecimalFormat df = new DecimalFormat("#.00");
	    return df.format(price);
	}
}
