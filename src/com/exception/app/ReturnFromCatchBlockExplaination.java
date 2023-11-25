package com.exception.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReturnFromCatchBlockExplaination {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
	    FileInputStream fis = new FileInputStream("file.txt");
	} catch (FileNotFoundException e) {
	    System.out.println("file not found");
	    return;
	} finally {
	    System.out.println("finally block");
	}
	System.out.println("new task");
    }

}
