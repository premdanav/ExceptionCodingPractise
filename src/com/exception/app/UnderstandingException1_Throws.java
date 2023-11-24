package com.exception.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnderstandingException1_Throws {

    public static void main(String[] args) {
	UnderstandingException1_Throws obj1 = new UnderstandingException1_Throws();
	try {
	    obj1.teachClass();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void teachClass() throws BookNotFoundException {
	String bookName = "Harry Porter 4";
	boolean isBookFound = locateBook(bookName);
	if (!isBookFound)
	    throw new BookNotFoundException("Book Not Found");
	else {
	    readBook(bookName);
	    explainContent(bookName);
	}
    }

    private void explainContent(String bookName) {
	// TODO Auto-generated method stub
	for (int i = 0; i < bookName.length(); i++) {
	    char ch = bookName.charAt(i);
	    System.out.println("content " + (i + 1) + "is " + ch);
	}
    }

    private void readBook(String bookName) {
	// TODO Auto-generated method stub
	System.out.println(bookName + " readed");
    }

    private boolean locateBook(String bookName) {
	List<String> bookList = new ArrayList<>();
	String[] books = { "Harry Porter 1", "Harry Porter 2", "Harry Porter 3" };
	bookList.addAll(Arrays.asList(books));

	if (bookList.contains(bookName))
	    return true;
	return false;
    }

}
