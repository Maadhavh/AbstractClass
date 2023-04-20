package com.jsp.testAbstractClass;

abstract class AbstractClass {
	int a;
	int b = 40;
	static int c;
	static int d = 30;
	
	final int e = 50;
	final int f;
	abstract void m1();
	abstract void m2();
	
	void m3() {
		System.out.println("Value of b: "+b);
		System.out.println("Hello");
	}
	
	static void m4() {
		System.out.println("This is a static method of Abstract class");
	}
	
	public AbstractClass(int a, int f) {
		this.a = a;
		this.f = f;
	}
	
}

class A extends AbstractClass {
	int b = 300;
	A(int a) {
		super(a, 20);
	}
	
	void assignVariableF() {
		System.out.println("f=300; This is not possible.\nBecause we can only initialize final variables at the time of declaration or using constructors"); 
		//Note: We can only 
	}
	void m1() {
		//f = 300; 
		System.out.println("This is m1 method of Abstract class");
	}
	
	void m2() {
		System.out.println("This is m2 method of Abstract class");
	}
}
public class TestAbstractClass {

	public static void main(String[] args) {
		int val = 10;
		AbstractClass a = new A(val);
		
		a.m3();
		//a.b = 20;
		a.m3();
		
		//int  = 100;
		
		System.out.println(a.a);
		a.m1();
		a.m2();
		a.m3();
		AbstractClass.m4();
		//or
		A.m4();
		
		A b = new A(400);
		b.assignVariableF();
	}

}
