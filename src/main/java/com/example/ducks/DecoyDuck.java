package com.example.ducks;


import com.example.lib.fly.FlyNoWay;
import com.example.lib.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck(String name) {
		super(name);
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}

	public void display() {
		System.out.println("I'm a wooden decoy duck");
	}


}
