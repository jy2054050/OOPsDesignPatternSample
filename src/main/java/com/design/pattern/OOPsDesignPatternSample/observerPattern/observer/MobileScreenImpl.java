package com.design.pattern.OOPsDesignPatternSample.observerPattern.observer;

import com.design.pattern.OOPsDesignPatternSample.observerPattern.observable.ObservableInterface;

public class MobileScreenImpl implements Observer{
	
	ObservableInterface observable;
	
	public MobileScreenImpl(ObservableInterface observable) {
		this.observable = observable;
	}
	
	@Override
	public void update() {
		System.out.println("MobileScreenImpl -> update called with data-"+ observable.getData());
		
	}

}
