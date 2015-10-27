package com.jvmhub.tutorial.entity;

public class MonopolyMoney   {

	private String playAmt;
	
	private String playCCY;

	public MonopolyMoney() {

	};

	public MonopolyMoney(String expenseAmt, String expenseCCY) {
		this.playAmt = expenseAmt;
		this.playCCY = expenseCCY;

	}

	public String getPlayAmt() {
		return playAmt;
	}

	public void setPlayAmt(String playAmt) {
		this.playAmt = playAmt;
	}

	public String getPlayCCY() {
		return playCCY;
	}

	public void setPlayCCY(String playCCY) {
		this.playCCY = playCCY;
	}




	
	
}
