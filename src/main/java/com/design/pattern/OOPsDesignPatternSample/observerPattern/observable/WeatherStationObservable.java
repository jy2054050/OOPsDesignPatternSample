package com.design.pattern.OOPsDesignPatternSample.observerPattern.observable;

import java.util.ArrayList;
import java.util.List;

import com.design.pattern.OOPsDesignPatternSample.observerPattern.observer.Observer;

public class WeatherStationObservable implements ObservableInterface{

	int data;
	
	List<Observer> ls;
	
	public WeatherStationObservable() {
		data = -1;
		ls = new ArrayList<>();
	}

	@Override
	public void add(Observer obj) {
		ls.add(obj);
		
	}

	@Override
	public void remove(Observer obj) {
		ls.remove(obj);
		
	}

	@Override
	public void updateAll() {
		for(Observer each: ls) {
			each.update();
		}
		
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
		updateAll();
	}
}
