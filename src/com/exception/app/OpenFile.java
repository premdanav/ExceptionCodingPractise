package com.exception.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OpenFile {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	// getting checked exception and handled by using try-catch block
	try {
	    FileInputStream fis = new FileInputStream("file.txt");
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
