package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int itemtypes = scan.nextInt(); 
		String[] itemnames = new String[itemtypes]; 
		double[] itemprices = new double[itemtypes];
		int[] camount = new int[itemtypes];
		int[] iamount = new int[itemtypes]; 
		
		for (int i = 0; i<itemtypes; i++) {
			itemnames[i] = scan.next(); 
			itemprices[i] = scan.nextDouble(); 
		}
		
		int amount = scan.nextInt(); 

		int index;
		for (int i = 0; i<amount; i++) {
			String fin = scan.next(); 
			String lname = scan.next(); 
			int itemcount = scan.nextInt(); 
			List inamesh = new ArrayList(); 
			for (int j = 0; j<itemcount; j++) {
				double itemnumber = Double.valueOf(scan.nextInt()); 
				String itemname = scan.next();  

				index = itemIndex(itemname, itemnames);
				if (inamesh.contains(itemname) == false) {
					camount[index] += 1;
				}
				inamesh.add(itemname);
				iamount[index] += itemnumber; 
			}
		}
		
		scan.close();

		for (int i = 0; i<camount.length; i++) {
			if (iamount[i] == 0) {
				System.out.println("No customers bought " + itemnames[i]);
			}
			else {
				System.out.println(camount[i] + " customers bought " + iamount[i] + " " + itemnames[i]);
			}
		}
	
		
	}
	
	static int itemIndex(String itemn, String[] itemstotal) {
		
		int index = -1;
		
		for (int i =0; i<itemstotal.length; i++) {
			if (itemstotal[i].contentEquals(itemn)) {
				index = i; 
			}

		}
		
		return index;
	}
		
}
