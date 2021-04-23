package org.howard.edu.assignment7.juint;

import org.howard.edu.assignment7.tollbooth.Lamb_Truck;
import org.howard.edu.assignment7.tollbooth.Jag_Truck;

import org.howard.edu.assignment7.tollbooth.LosAngelesTollBooth;
import org.howard.edu.assignment7.tollbooth.tollBooth;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.assignment7.tollbooth.*;


public class TestTollBooth extends LosAngelesTollBooth {

	
	
	@Test
	@DisplayName("Test cases for toll booth")
	
	public static void main(String[] args) {
		
		tollBooth a = new LosAngelesTollBooth();
		Truck b = new Lamb_Truck(2, 10000);
		Truck urus = new Lamb_Truck(4, 12000);
		Truck d = new Jag_Truck(5,14000);
		Truck e = new Jag_Truck(3,11000);

		
		a.calculateTotal(b);
		a.calculateTotal(urus);
		a.displayData();
		assertEquals(250, receiptsTotal);
		a.reset();
		assertEquals(0, trucksTotal);
		assertEquals(0, receiptsTotal);

		a.calculateTotal(d);
		a.calculateTotal(e);
		a.calculateTotal(urus);

		a.displayData();

	}
	
	
}
