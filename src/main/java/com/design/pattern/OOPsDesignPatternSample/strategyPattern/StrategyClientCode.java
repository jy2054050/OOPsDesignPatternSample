package com.design.pattern.OOPsDesignPatternSample.strategyPattern;

public class StrategyClientCode {

	public static void main(String[] args) {

		PaymentContext payContext = new PaymentContext();
		
		payContext.setPaymentContext(new CreditCardPayment());
		payContext.makePayment(100);
		
		payContext.setPaymentContext(new UPIPayment());
		payContext.makePayment(10);
		
		payContext.setPaymentContext(new CashPayment());
		payContext.makePayment(12);
	}
}
