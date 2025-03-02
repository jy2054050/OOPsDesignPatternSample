package com.design.pattern.OOPsDesignPatternSample.strategyPattern;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void makePayment(int inr) {
		System.out.println("made payment with credit card of ruppees - " + inr);
		
	}
}
