package com.example.ducks;

import com.example.lib.fly.FlyWithWings;
import com.example.lib.quack.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck(String name) {
		super(name);
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a real Redhead duck");
	}
}