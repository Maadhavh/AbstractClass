package com.jsp.testAbstractClass2;

abstract class Calculator {
	abstract double addition(int a, int b);
	abstract double deletion(int a, int b);
	abstract double multiply(int a, int b);
}

class ArithmeticOperations extends Calculator {

	@Override
	double addition(int a, int b) {
		return a+b;
	}

	@Override
	double deletion(int a, int b) {
		return a-b;
	}

	@Override
	double multiply(int a, int b) {
		return a*b;
	}
	
	
	
	
	void display() {
		System.out.println("Hey... Hello");
	}
	
}
public class TestAbstractMethods {

	public static void main(String[] args) {
		Calculator cl = new ArithmeticOperations();
		
		//In the below lines of code we are discarding return values of all the calls.Java supports this feature.
		//We can only access methods of Calculator class using cl object
		//even though its referring to ArithmeticOperations Class.
		
		System.out.println(cl.addition(2, 3));
		cl.multiply(4, 5);
		cl.deletion(8, 9);
	}

}
