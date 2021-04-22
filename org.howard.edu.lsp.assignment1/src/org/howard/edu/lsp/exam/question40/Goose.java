package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal {
	
		public Goose() {

	   }

	   public void speak() {

	       System.out.println("The Goose speaks.");

	   }  

	   public void move() {

	       System.out.println("The Goose moves forward.");

	   }
	  
	@Override

	   public void fly() {

	       System.out.println(getClass().getSimpleName() + " flies.");  

	   }

}
