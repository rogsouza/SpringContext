package com.example.SpringContext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start bike");
	}

	@Override
	public void stop() {
		System.out.println("Stop bike");
	}

}
