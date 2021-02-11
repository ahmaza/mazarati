package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetNum {
	
public ArrayList<String> targetNumber(int array[], int target){
	    
	    int[] array_copy = (int[])array.clone(); 
	    // makes copy of inputted array 

	    System.out.println("array of numbers " + Arrays.toString(array_copy)); //converts array to string
	    System.out.println("Target #: " + target); 
	    
	    ArrayList<String> new_array = new ArrayList<String>(); // returns value
	    
	    // for loop to intialize thru array
	    for (int i = 0; i < array.length; i++) { //counter

				int total = array[i]; //total to keep count
				String solution = Integer.toString(i); //to string 

	      // if statements 
				if (target == total) {
					new_array.add(solution);
	        // adds to solution set
				}
	      int x = 0;
	      
	      while (x < array.length - 1 ){
	        if(x == i){
	          x++;
	          continue;
	        }
	        total += array[x];
	        
	        if (total < target) {
	            solution += ",";
	            solution += Integer.toString(x);
	        }
					else if (total == target) {
	          solution += ",";
	          solution += Integer.toString(x);
	          new_array.add(solution); // add solution to array
	          
					}
	        else if (total > target){
	          solution = Integer.toString(i);
	          
	          total = array[i] + array[x] ;
	          if (total < target) {
	            solution += ",";
	            solution += Integer.toString(x);
	        }
					  else if (total == target) {
	          solution += ",";
	          solution += Integer.toString(x);

	          new_array.add(solution);
					}
	        else{
	            total = array[i];
	          }
	        }
	        x++;
	      }
	      System.out.println("\n"); //newl
	  }
	  return new_array;
	  }


}
