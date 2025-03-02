package com.design.pattern.OOPsDesignPatternSample.observerPattern.observer;

import com.design.pattern.OOPsDesignPatternSample.observerPattern.observable.ObservableInterface;

public class TvScreenImpl implements Observer{
	
	ObservableInterface observable;
	
	public TvScreenImpl(ObservableInterface observable) {
		this.observable = observable;
	}
	
	@Override
	public void update() {
		System.out.println("TvScreenImpl -> update called  with data-"+ observable.getData());
		
	}

}
