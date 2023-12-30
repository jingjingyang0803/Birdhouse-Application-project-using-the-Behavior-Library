package com.example.ducks;

import com.example.lib.fly.FlyBehavior;
import com.example.lib.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	private String name;

	public Duck(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public abstract void display();

	public String performFly() {
		return flyBehavior.fly();
	}

	public String performQuack() {
		return quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}