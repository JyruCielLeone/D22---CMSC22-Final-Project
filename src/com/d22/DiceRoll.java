package com.d22;

import java.util.ArrayList;

public class DiceRoll {

	public ArrayList<Integer> rollNew(int diceNumber, int diceSides, int rollModifier) {
		ArrayList<Integer> rollResultsArray = new ArrayList<Integer>();
		for(int i = 0; i < diceNumber; i++) {
			Die LuckyDie = new Die();
			int rollResults = LuckyDie.rollDie(diceSides);
			rollResultsArray.add(rollResults);
		}
		return rollResultsArray;
	}
	
	public String displayRolls(ArrayList<Integer> rollArray) {
		StringBuilder rollDisplay = new StringBuilder();
		for (int i = 0; i < rollArray.size(); i++) {
		  int rolledNumber = rollArray.get(i);
		  rollDisplay.append("(" + rolledNumber + ") ");
		}
		String rollTally = rollDisplay.toString();
		return rollTally;
	}
	
	public int addRolls(ArrayList<Integer> rollList, int rollModifier) {
		int rollSum = 0;
		for (int x = 0; x < rollList.size(); x++) {
			rollSum = rollSum + rollList.get(x);
		}
		int total = rollSum + rollModifier;
		return total;
	}
	
}
