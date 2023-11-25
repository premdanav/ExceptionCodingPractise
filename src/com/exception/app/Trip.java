package com.exception.app;

import java.time.LocalTime;

public class Trip {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	goTrekking(LocalTime.now());

    }

    public static void goTrekking(LocalTime startTime) {
	int hrs = (LocalTime.now().getHour() + 3) - startTime.getHour();
	if (hrs > 2)
	    throw new FeelingHungryException("eaten");
    }

}
