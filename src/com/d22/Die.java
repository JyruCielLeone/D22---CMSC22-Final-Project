package com.d22;

import java.util.Random;

public class Die {

	public int rollDie(int sides) {
		Random die = new Random();
		int roll = die.nextInt(sides);
		++roll;
		return roll;
	}

}