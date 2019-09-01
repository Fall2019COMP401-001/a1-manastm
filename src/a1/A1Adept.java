package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemtypes = scan.nextInt(); 
		String[] itemnames = new String[itemtypes]; 
		double[] itemprices = new double[itemtypes];
		
		for (int i = 0; i<itemtypes; i++) {
			itemnames[i] = scan.next(); 
			itemprices[i] = scan.nextDouble(); 
		}
		
		int amount = scan.nextInt(); 
		String[] namedata = new String[amount];
		double[] tprice = new double[amount]; 
	
		int smallest = 0;
		int biggest = 0;
		int index;
		for (int i = 0; i<amount; i++) {
			String fin = scan.next(); 
			String lname = scan.next(); 
			int itemcount = scan.nextInt(); 
			double totalcost = 0.0;
			namedata[i] = fin + " " + lname;
			
			for (int j = 0; j<itemcount; j++) {
				double itemnumber = Double.valueOf(scan.nextInt()); 
				String itemname = scan.next();  
				index = itemIndex(itemname, itemnames);
				double itemsprice = itemnumber * Double.valueOf(itemprices[index]); 
				totalcost += itemsprice; 
			}
			tprice[i] = totalcost; 
			if (totalcost > tprice[biggest]) {
				biggest = i;
			}
			else if (totalcost < tprice[smallest]) {
				smallest = i; 
			}
			else {
				
			}
		}
		
		scan.close();
		
		double averagetotal = 0;
		
		System.out.println("Biggest: " + namedata[biggest] + " (" + String.format("%.2f", tprice[biggest]) + ")");
		System.out.println("Smallest: " + namedata[smallest] + " (" + String.format("%.2f", tprice[smallest]) + ")");
		
		for (int i = 0; i<tprice.length; i++) {
			averagetotal += tprice[i];
		}
		
		System.out.println("Average: " + String.format("%.2f", averagetotal/tprice.length));
	
		
	}
	
	static int itemIndex(String itemn, String[] itemstotal) {
		
		int index = 0;
		
		for (int i =0; i<itemstotal.length; i++) {
			if (itemstotal[i].contentEquals(itemn)) {
				index = i; 
			}

		}
		
		return index;
	}
}









