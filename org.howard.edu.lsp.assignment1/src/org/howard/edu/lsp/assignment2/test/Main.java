package org.howard.edu.lsp.assignment2.test;

import org.howard.edu.lsp.assignment2.combination.*;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

	    //TEST CASES
	    
	    int[] given_array = {5, 7, 1, 6, 3};
	    int target_num = 8;

	    int[] given_array2 = {5, 7, 1, 6, 3};
	    int target_num2 = 11;

	    int[] given_array3 = {1, 2, 3, 4, 5, 6};
	    int target_num3 = 6;

	    // PRINTING TEST CASES
	    TargetNum TestRun = new TargetNum();
		System.out.println(TestRun.targetNumber(given_array,target_num));
	    System.out.println(TestRun.targetNumber(given_array2,target_num2));
	    System.out.println(TestRun.targetNumber(given_array3,target_num3));

	  }
	  
}
