package com.example.birdhouse;

import com.example.ducks.*;

import java.util.ArrayList;
import java.util.List;

public class BirdHouse {
	public static final BirdHouse INSTANCE = new BirdHouse();

	private List<Duck> ducks;

	private BirdHouse() {
		ducks = new ArrayList<>();
	}

	public void addMallardDuck(String name) {
		ducks.add(new MallardDuck(name));
	}

	public void addRedheadDuck(String name) {
		ducks.add(new RedheadDuck(name));
	}

	public void addRubberDuck(String name) {
		ducks.add(new RubberDuck(name));
	}

	public void addDecoyDuck(String name) {
		ducks.add(new DecoyDuck(name));
	}

	public void bigNoise() {
		for (Duck duck : ducks) {
			System.out.println(duck.getClass().getSimpleName() + " " + duck.getName() + " says " + duck.performQuack() + ".");
		}
	}

	public void bigFly() {
		for (Duck duck : ducks) {
			System.out.println(duck.getClass().getSimpleName() + " " + duck.getName() + " " + duck.performFly());
		}
	}
}
