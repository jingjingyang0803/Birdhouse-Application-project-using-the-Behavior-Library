package com.example.ducks;

import com.example.lib.fly.FlyWithWings;
import com.example.lib.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck(String name) {
		super(name);
		flyBehavior=new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}