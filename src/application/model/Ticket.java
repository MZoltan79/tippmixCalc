package application.model;

import java.util.ArrayList;
import java.util.List;

import application.Odds;

public class Ticket {
	
	
	private List<int[]> combinations;
	private ArrayList<Double> odds;
	private double bet;
	private double sumOdds;
	private double sumPrize;
	
	public Ticket() {
		this.odds = new ArrayList<>();
		this.sumOdds = 0;
		this.sumPrize = 0;
	}
	
	private void helper(List<int[]> combinations, int[] data, int start, int end, int index) {
		if(index == data.length) {
			int[] combination = data.clone();
			combinations.add(combination);
		} else if(start <= end) {
			data[index] = start;
			helper(combinations, data, start+1, end, index+1);
			helper(combinations, data, start+1, end, index);
		}
	}
	
	private List<int[]> generate(int n, int r) {
		List<int[]> combinations = new ArrayList<int[]>();
		helper(combinations, new int[r], 0, n-1, 0);
		return combinations;
	}
	
	private int roundTo5(double sumPrize) {
		int result = (int) sumPrize;
		if(result % 10 < 3 && result % 10 > 0) {
			return result-result % 10; 
		} else if(result % 10 > 2 && result % 10 < 5) {
			return result + (5-(result % 10));
		} else if(result % 10 > 5 && result % 10 < 8) {
			return result - ((result % 10) - 5); 
		} else if(result % 10 > 7) {
			result = result + (10-(result % 10));
		} 
		return result;
	}
	
	public Integer calculate(int kotes) {
		sumPrize = 0;
		combinations = generate(odds.size(), kotes);
//		System.out.printf("generated %d combinations of %d items from %d \n", combinations.size(), kotes, odds.size());
		for(int i = 0; i < combinations.size(); i++) {
			double temp = 1;
			double tempOdds = 0;
			for(int j = 0; j < combinations.get(i).length; j++) {
				temp *= odds.get(combinations.get(i)[j]);
			}
			temp = Math.round(temp*100);
			tempOdds = temp/100;
			double tempPrize = Math.round(bet*tempOdds*100);
			tempPrize = tempPrize/100;
			if(tempPrize >= 1000000) {
				return null;
			}
			sumPrize += tempPrize;
//			System.out.println(i+1 + ". fogadás oddsa: " + tempOdds + " várható nyeremény: " + tempPrize + " Ft.");
			
		}
		sumPrize = Math.round(sumPrize);
		return roundTo5(sumPrize);
	}

	public double getBet() {
		return bet;
	}

	public void setBet(double bet) {
		this.bet = bet;
	}
	
	public void addOdds(double odds) {
		if(this.odds.size() < 21) {
			this.odds.add(odds);
		} else {
			System.out.println("Elérted a 20 eseményt!");
		}
	}
	
	public void addAllOdds(ArrayList<Odds> odds) {
		this.odds.clear();
		odds.forEach(e -> this.odds.add(e.getOdds()));
	}
	
	public void clearOdds() {
		odds.clear();
	}

}
