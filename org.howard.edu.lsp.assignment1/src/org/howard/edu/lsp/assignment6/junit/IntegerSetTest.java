package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.howard.edu.lsp.assignment6.integerset.*;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;

import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;
class IntegerSetTest {
	
	IntegerSet test1 = new IntegerSet();
	IntegerSet test2 = new IntegerSet();
	IntegerSet test3 = new IntegerSet();

	
	//adding to list
	

	@Test
	@DisplayName("Test cases for clear")
	
	
	public void ClearTest() {
		
		
		for (int x = 0; x < 8; x++)
			test1.add(x);
		assertFalse(test1.isEmpty());
		test1.clear();
		assertTrue(test1.isEmpty());
		
		for (int x = 0; x < 12; x++)
			test2.add(x);;
		assertFalse(test2.isEmpty());
		test2.clear();
		assertTrue(test2.isEmpty());
		
		
	}
	
	@Test
	@DisplayName("Length Test")
	public void LengthTest() {
		
		for (int x = 0; x < 8; x++)
			test1.add(x);
		assertTrue(test1.length() == 8);
		assertFalse(test1.length() != 8);
		
		for (int x = 0; x < 22; x++)
			test2.add(x);
		assertTrue(test2.length() == 22);
		assertFalse(test2.length() != 22);
		
		assertTrue(test3.length() == 0);
		
	
		
	}
	
	@Test
	@DisplayName("Equal Test")
	public void EqualTest () {
		
		for (int x = 0; x < 30; x++)
			test1.add(x);
		assertFalse(test1.equals(test2) == true);
		for (int x = 0; x < 30; x++)
			test2.add(x);
		assertTrue(test1.equals(test2)== false);

		
	}
	
	@Test
	@DisplayName("Contain Test")
	public void ContainTest () {
		
		assertFalse(test3.contains(5));
		
		for (int x = 0; x < 25; x++)
			test1.add(x);
		assertTrue(test1.contains(22));
		assertFalse(test1.contains(25));
		assertTrue(test1.contains(5));
		
		for (int x = 0; x < 10; x++)
			test2.add(x);
		assertTrue(test2.contains(2));
		assertFalse(test2.contains(10));
		assertTrue(test2.contains(7));
		
		for (int x = 0; x < 25; x++)
			if (x % 2 == 0) {
				test3.add(x);
			}
		assertTrue(test3.contains(22));
		assertFalse(test3.contains(25));
		assertFalse(test3.contains(5));	
		
	}
	
	@Test
	@DisplayName("Largest Item Test")
	public void LargestItem() throws IntegerSetException {
		
		assertThrows(IntegerSetException.class, () -> test3.largest(), "Nothing in set");
		
		for (int x = 0; x < 65; x++)
			test1.add(x);
		assertTrue(test1.largest() == 64);
		assertFalse(test1.largest() == 1);
		test1.clear();
		
		assertThrows(IntegerSetException.class, () -> test1.largest(), "Nothing in set");
		
		for (int x = 0; x < 100; x++)
			if (x % 3 == 0) {
				test2.add(x);
			}
		assertFalse(test2.largest() == 98);
		assertTrue(test2.largest() == 99);
		
	}	
	
	@Test
	@DisplayName("Smallest Item Test")
	public void SmallestItem() throws IntegerSetException {
		
		assertThrows(IntegerSetException.class, () -> test3.smallest(), "Nothing in set");
		
		for (int x = 0; x < 45; x++)
			test1.add(x);
		assertTrue(test1.smallest() == 0);
		assertFalse(test1.smallest() == 44);
		test1.clear();
		
		assertThrows(IntegerSetException.class, () -> test1.smallest(), "Nothing in set");
		
		for (int x = 0; x < 20; x++)
			if (x % 3 == 0) {
				test2.add(x);
			}
		assertFalse(test2.smallest() == 18);
		assertTrue(test2.smallest() == 0);
		
	}	
	
	@Test
	@DisplayName("Add Item Test")
	public void AddItem()  {
		// test1
		for (int x = 0; x < 100; x++) {
			if (x % 4 == 0) {
				test1.add(x);
			}
		}
		assertTrue(test1.contains(4));
		test1.add(20);
		assertTrue(test1.contains(20));
		assertFalse(test1.contains(75));
		
		//test 2

		for (int x = 50; x < 100; x++) {
			if (x % 2 == 0) {
				test2.add(x);
			}
		}
		
		assertTrue(test2.contains(54));
		assertFalse(test2.contains(55));
		
	}
	
	@Test
	@DisplayName("Remove Item Test")
	public void RemoveItem()  {
		//test1
		for (int x = 0; x < 50; x = x+2) {
			test1.add(x);
		}
		test1.remove(0);
		test1.remove(11);
		test1.remove(24);
		
		assertFalse(test1.contains(0));
		assertFalse(test1.contains(24));
		
		
	} 
	
	@Test
	@DisplayName("Intersection Test")
	public void InterItem()  {
		for (int x = 0; x < 10; x++) {
			test1.add(x);

		}
		for (int x = 0; x < 10; x++) {
			if (x % 2 == 0) {
				test2.add(x);
			}
		}
		test1.intersect(test2);
		System.out.println("this ::" + test2);
		assertEquals(test1.toString(), "[]");
	}
	
	@Test
	@DisplayName("Union Test")
	public void UnionItem()  {
		
		for (int x = 0; x < 10; x++) {
			test1.add(x);

		}
		for (int x = 0; x < 10; x++) {
			if (x % 2 == 0) {
				test2.add(x);
			}
		}
		
		test1.union(test2); 
		assertEquals(test1.toString(), "[null, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");		
		
		for (int x = 0; x < 15; x++) {
			test3.add(x);
		}
		test2.union(test3);
		assertEquals(test2.toString(), "[null, 0, 2, 4, 6, 8]");	
	}
	
	@Test
	@DisplayName("Diff Test")
	public void DiffItem()  {
		
		for (int x = 0; x < 10; x++) {
			test1.add(x);

		}
		for (int x = 0; x < 10; x++) {
			if (x % 2 == 0) {
				test2.add(x);
			}
		}
		
		test2.diff(test3);
		
		assertEquals(test2.toString(), "[0, 2, 4, 6, 8]");
	}
	
	@Test
	@DisplayName("isEmpty Test")
	public void Empty () {
		
		assertTrue(test1.isEmpty() == true); 
		assertFalse(test2.isEmpty() == false);
		
		for (int x = 2; x < 30; x++) {
			test1.add(x);
		}
		assertFalse(test1.isEmpty() == true); 
		
		for (int x = 0; x < 45; x++) {
			test2.add(x);
		}
		assertTrue(test2.isEmpty() == false);
		assertFalse(test2.isEmpty() == true);
		
	}
	
	@Test
	@DisplayName("Clear Test")
	public void Clear () {
		assertTrue(test1.isEmpty() == true);
		
		for (int x = 0; x < 60; x = x + 5) {
			test1.add(x);
		}
		test1.clear();
		assertFalse(test1.isEmpty() == false);
		assertTrue(test1.isEmpty() == true);

	}
	
	@Test
	@DisplayName("To String Test")
	public void Tostring()  {
		for (int x = 0; x < 10; x++) {
			test1.add(x);
		}
		System.out.println("This 1::" + test1);
		assertEquals(test1.toString(), "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
		
		for (int x = 0; x < 15; x++) {
			if (x % 2 == 0) {
				test2.add(x);
			}	
		}
		assertEquals(test2.toString(), "[0, 2, 4, 6, 8, 10, 12, 14]");
		

	
  }	
	
	
	
}
