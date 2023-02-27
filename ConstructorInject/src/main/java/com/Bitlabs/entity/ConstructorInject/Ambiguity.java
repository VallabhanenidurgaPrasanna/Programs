package com.Bitlabs.entity.ConstructorInject;

public class Ambiguity {
private int a;
private int b;
public Ambiguity(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	System.out.println("this is integer Constructor");
}
public Ambiguity(String a, String b) {
	super();
	this.a = Integer.parseInt(a);
	this.b = Integer.parseInt(b);
	System.out.println("this is String Constructor");
}

@Override
public String toString() {
	return "Ambiguity [a=" + a + ", b=" + b + "]";
}
public void show() {
	System.out.println("the sum of a and b is" + (a+b));
}

}
