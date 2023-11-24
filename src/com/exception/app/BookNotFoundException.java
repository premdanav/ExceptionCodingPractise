package com.exception.app;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(String msg) {
	System.out.println(msg);
    }
}
