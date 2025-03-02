package com.design.pattern.OOPsDesignPatternSample.strategyPattern;

public class UPIPayment implements PaymentStrategy{

	@Override
	public void makePayment(int inr) {
		System.out.println("made payment with UPI of ruppees - " + inr);
		
	}
}
