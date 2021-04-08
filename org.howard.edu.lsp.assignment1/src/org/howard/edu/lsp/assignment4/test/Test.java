package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

import java.util.Arrays;
import java.util.ArrayList;
/**
 * 
 * @author ahmaz athias
 * These are the test cases for all of the functions. 
 *
 */

public class Test {

	public static void main(String[] args) throws IntegerSetException {
		
		
			
			IntegerSet test1 = new IntegerSet();
			IntegerSet test2 = new IntegerSet();
			IntegerSet test3 = new IntegerSet();
			IntegerSet test4 = new IntegerSet();

			
			//adding to list
			test1.add(2);
			test1.add(3);
			test1.add(7);
			test1.add(8);
			test1.add(13);
			
			test2.add(20);
			test2.add(2);
			test2.add(-3);
			test2.add(13);
			test2.add(1);
			test2.add(16);
			
			test4.add(22);
			test4.add(6);
			test4.add(-7);
			test4.add(8);
			test4.add(11);
			test4.add(13);
			test4.add(24);
			
			
			
			// length test
			
			System.out.println("TEST OUTPUTS:");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("Length Test");

			System.out.println("length is: " + test1.length());
			System.out.println("length is: " + test2.length());
			System.out.println("length is: " + test3.length());
			System.out.println("length is: " + test4.length());

			
			System.out.println("\n");
			System.out.println("\n");

			// contains test
			System.out.println("T if contains, F if it doesn't: " + test1.contains(13));
			System.out.println("T if contains, F if it doesn't: " + test1.contains(5));
			System.out.println("T if contains, F if it doesn't: " + test1.contains(8));

			System.out.println("\n");
			System.out.println("\n");
			
			// largest test
			try {
				System.out.println("largest value: " + test1.largest());	
			}
			catch (IntegerSetException s) {
				System.out.println(s);
			}
			try {
				System.out.println("largest value: " + test2.largest());	
			}
			catch (IntegerSetException s) {
				System.out.println(s);
			}
			try {
				System.out.println("largest value: " + test3.largest());	
			}
			catch (IntegerSetException s) {
				System.out.println(s);
			}
			
			
			System.out.println("\n");
			System.out.println("\n");
			
			//add test
			test1.add(8);
			test2.add(-5);
			test2.add(21);
			test2.add(21);
			
			System.out.println("\n");
			System.out.println("\n");
			
			//remove test
			test1.remove(3);
			test2.remove(-3);
			test3.remove(13);
			test4.remove(25);


			System.out.println("\n");
			System.out.println("\n");
			
			//is empty test
			System.out.println("T if empty, F if not: " + test1.isEmpty());
			System.out.println("T if empty, F if not: " + test2.isEmpty());	
			System.out.println("T if empty, F if not: " + test3.isEmpty());
			System.out.println("T if empty, F if not: " + test4.isEmpty());	

			
			System.out.println("\n");
			System.out.println("\n");
			
			
			//string test
			System.out.println(test1.toString());
			System.out.println("This one: " + test2.toString());
			System.out.println(test3.toString());

			
			System.out.println("\n");
			System.out.println("\n");
			
			//union test
			// test1.diff(test2);
			
			//equal test
			System.out.println("T if equal, F if not: " + test1.equals(test2));
			System.out.println("T if equal, F if not: " + test2.equals(test3));
			
			System.out.println("smallest: " + test1.smallest());


		
			// clear test
			test1.clear();
			test2.clear();
			test3.clear();
		}
		
		
		
	}


