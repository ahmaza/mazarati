package org.howard.edu.assignment7.tollbooth;

public class LosAngelesTollBooth implements tollBooth {
	
	protected static int receiptsTotal;
	protected static int trucksTotal = 0; 
	public void displayData() {
		
		System.out.print("Totals since last collection - Receipts: ");
        System.out.print(receiptsTotal);
        System.out.print(" Trucks: ");
        System.out.println(trucksTotal);
		
	}

	public void reset() {
		
		System.out.print("*** Collecting receipts *** ");
        displayData();
        receiptsTotal = 0;
        trucksTotal = 0;
		
	
	}

	@Override
	public int calculateTotal(Truck a) {
		int axl = a.axl;
		int weight = a.weight;
		
		int tollCost = 5 * axl + 10 * (weight/1000); 
		
		
		System.out.print(" Toll due: ");
        System.out.println(tollCost);
        trucksTotal = trucksTotal + 1;
        receiptsTotal = receiptsTotal + tollCost;
        
		
		// TODO Auto-generated method stub
		return 0;
	}

}
