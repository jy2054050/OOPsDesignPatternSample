package com.design.pattern.OOPsDesignPatternSample.strategyPattern;

public class PaymentContext {

	PaymentStrategy strategy;
	
	public void setPaymentContext(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void makePayment(int inr) {
		strategy.makePayment(inr);
	}
}
