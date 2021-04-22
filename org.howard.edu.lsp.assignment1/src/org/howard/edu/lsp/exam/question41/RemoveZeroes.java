package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class RemoveZeroes {
	public static void display(ArrayList<Integer> arr) {
		int size = arr.size();
		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x) == 0) {
				arr.remove(x);
			}
			
		}		
	}

	//JUNIT TestCase
	@Test
	@DisplayName("Test cases for 0")
	
	public void removezerostest() {
		ArrayList lis1 = new ArrayList<Integer>();
		ArrayList lis2 = new ArrayList<Integer>();
		
		lis1.add(0);
		lis1.add(2);
		lis1.add(3);
		lis1.add(4);
		lis1.add(6);
		lis1.add(0);
		
		lis2.add(0);
		lis2.add(9);
		lis2.add(8);
		lis2.add(4);
		lis2.add(2);
		lis2.add(0);

		assertTrue(lis1.size() == 6);
		
		display(lis1);
		
		assertTrue(lis1.size() == 4); 
		
		assertTrue(lis2.size() == 6);

		display(lis2);
		//System.out.println(lis2);
		assertTrue(lis1.size() == 4); 

		

		
		//assertTrue(lis2.size() == 4);
		
		
		 
		
		
	}

}
