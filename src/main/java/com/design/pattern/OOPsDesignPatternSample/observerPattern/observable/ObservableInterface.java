package com.design.pattern.OOPsDesignPatternSample.observerPattern.observable;

import com.design.pattern.OOPsDesignPatternSample.observerPattern.observer.Observer;

public interface ObservableInterface {
	
	void updateAll();
	void add(Observer obj);
	void remove(Observer obj);
	void setData(int data);
	int getData();
}
