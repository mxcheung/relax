package com.jvmhub.tutorial.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppUser implements Serializable {

	public AppUser() {

	};

	public AppUser(String login) {
		this.login = login;

	};

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String login;

	@Column(name="christianName") 
	@Basic(optional = false)
	private String firstName;

	private BigDecimal expenseAmt;

	private Currency expenseCCY;

	private String location;

	private String dept;

	private String plan;
	
	private MonopolyMoney playMoney;
	
	private PayType payType;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public BigDecimal getExpenseAmt() {
		return expenseAmt;
	}

	public void setExpenseAmt(BigDecimal expenseAmt) {
		this.expenseAmt = expenseAmt;
	}

	public Currency getExpenseCCY() {
		return expenseCCY;
	}

	public void setExpenseCCY(Currency expenseCCY) {
		this.expenseCCY = expenseCCY;
	}

	public MonopolyMoney getPlayMoney() {
		return playMoney;
	}

	public void setPlayMoney(MonopolyMoney playMoney) {
		this.playMoney = playMoney;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}


	
}
