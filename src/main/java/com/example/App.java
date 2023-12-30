package com.example;

import com.example.birdhouse.*;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello! Welcome to our BirdHouse! ");
		System.out.println("-------------------------");

		BirdHouse instance = BirdHouse.INSTANCE;

		instance.addMallardDuck("Donald");
		instance.addMallardDuck("Hewey");
		instance.addMallardDuck("Scrooge");

		instance.addRedheadDuck("Reddi");
		instance.addRubberDuck("Rubby");
		instance.addDecoyDuck("Doco");

		instance.bigNoise();

		System.out.println("-------------------------");

		instance.bigFly();
	}
}
