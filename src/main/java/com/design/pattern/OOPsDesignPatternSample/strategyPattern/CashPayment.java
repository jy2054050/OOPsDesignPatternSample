package com.design.pattern.OOPsDesignPatternSample.strategyPattern;

public class CashPayment implements PaymentStrategy{

	@Override
	public void makePayment(int inr) {
		System.out.println("made payment with cash of ruppees - " + inr);
		
	}
}
