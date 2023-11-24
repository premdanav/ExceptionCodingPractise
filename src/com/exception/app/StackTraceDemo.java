package com.exception.app;

public class StackTraceDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	method1();
    }

    public static void method1() {
	method2();
    }

    public static void method2() {
	int[] arr = { 1, 2, 3, 4 };
	System.out.println(arr[5]);
    }

}
