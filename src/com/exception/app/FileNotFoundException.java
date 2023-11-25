package com.exception.app;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	try {
	    FileInputStream fis = new FileInputStream("file.txt");
	    System.out.println("file opened");
	    fis.read();
	} catch (java.io.FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    System.out.println("finally block");
	}

	System.out.println("this is last statement");
    }

}
