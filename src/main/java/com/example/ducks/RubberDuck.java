package com.example.ducks;

import com.example.lib.fly.FlyNoWay;
import com.example.lib.quack.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck(String name) {
		super(name);
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	public void display() {
		System.out.println("I'm a rubber duckie");
	}

}
