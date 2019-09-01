package a1;

import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int amount = scan.nextInt(); 
		String[] namedata = new String[amount];
		double[] tprice = new double[amount]; 
	
		
		for (int i = 0; i<amount; i++) {
			String fin = scan.next().charAt(0) + "."; 
			String lname = scan.next(); 
			int itemcount = scan.nextInt(); 
			double totalcost = 0.0;
			namedata[i] = fin + " " + lname;
			
			for (int j = 0; j<itemcount; j++) {
				double itemamount = Double.valueOf(scan.nextInt()); 
				String itemname = scan.next(); 
				double price = scan.nextDouble(); 
				double itemfcost = itemamount * price; 
				totalcost += itemfcost; 
			}
			tprice[i] = totalcost; 
		}
		
		scan.close();
		
		for (int i = 0; i<amount; i++) {
			System.out.println(namedata[i] + ": " + String.format("%.2f", tprice[i]));
		}
		
	}
}

//Practice solution using objects and classes 

//class Person() {
//	
//	String fname; 
//	String lname; 
//	int itemc; 
//	String[] items;
//	
//	 Person(fn, ln, itemc, String[] items) {
//		 this.fname = fn; 
//		 this.lname = ln; 
//		 this.itemc = itemc; 
//		 this.items = items; 
//	 }
//	 
//	  getOutput() {
//		 
//	 }
//	
//}
