package com.exception.app;

public class MethodAccess {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

//stack overflow error---programmatic error
    public static void myMethod() {
	System.out.println("my method");
	myMethod();
    }

}
