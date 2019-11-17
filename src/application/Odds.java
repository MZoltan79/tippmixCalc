package application;

import java.io.Serializable;

public class Odds implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double odds;
	private double calc;
	private boolean won;

	public Odds(double odds) {
		this.odds = odds;
		this.calc = 0;
		this.won = true;
	}

	public double getOdds() {
		return odds;
	}

	public void setOdds(double odds) {
		this.odds = odds;
	}

	public double getCalc() {
		return calc;
	}

	public void setCalc(double calc) {
		this.calc = calc;
	}

	public boolean isWon() {
		return won;
	}

	public void setWon(boolean won) {
		this.won = won;
	}
	
	
}
