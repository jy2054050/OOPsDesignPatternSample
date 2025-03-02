package com.design.pattern.OOPsDesignPatternSample.observerPattern.ClientCode;

import com.design.pattern.OOPsDesignPatternSample.observerPattern.observable.ObservableInterface;
import com.design.pattern.OOPsDesignPatternSample.observerPattern.observable.WeatherStationObservable;
import com.design.pattern.OOPsDesignPatternSample.observerPattern.observer.MobileScreenImpl;
import com.design.pattern.OOPsDesignPatternSample.observerPattern.observer.TvScreenImpl;

public class ObserverPatternClientCode {
	
	public static void main(String[] args) {
		
		ObservableInterface observable = new WeatherStationObservable();
		
		observable.add(new TvScreenImpl(observable));
		observable.add(new MobileScreenImpl(observable));

		observable.setData(10);
		
	}
}
