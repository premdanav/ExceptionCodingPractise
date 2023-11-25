package com.exception.app;

public class FeelingHungryException extends RuntimeException {
    public FeelingHungryException(String msg) {
	System.out.println(msg);
    }

}
