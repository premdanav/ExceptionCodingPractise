package com.exception.app;

public class ArrayAccess {

    public static void main(String[] args) {
	String[] students = { "shreya", "joseph", null };
	String name = students[5];// ArrayINdexOutOfBoundException
	System.out.println(name);
    }

}
