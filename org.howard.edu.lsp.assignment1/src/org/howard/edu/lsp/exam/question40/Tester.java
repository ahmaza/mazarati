package org.howard.edu.lsp.exam.question40;

public class Tester {

	public static void main(String args[]) {
		Animal animal1 = new Goose();
		animal1.speak();
		
		animal1.move();
		
		Animal animal2 = new Tiger();
		animal2.move();		
		
		animal1.fly(); 
		
		Flying plane = new Airplane();
		plane.fly();
	}
}
