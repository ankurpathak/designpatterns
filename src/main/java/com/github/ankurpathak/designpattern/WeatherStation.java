package com.github.ankurpathak.designpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    private final List<IObserver> observers;

    private int tempearature;


    public int getTempearature() {
        return tempearature;
    }

    public void setTempearature(int tempearature) {
        this.tempearature = tempearature;
        broadcast();
    }

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        if (observer != null)
            this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (!CollectionUtil.isEmpty(observers))
            if (observer != null)
                observers.remove(observer);
    }

    @Override
    public void broadcast() {
        if (!CollectionUtil.isEmpty(observers))
            observers.forEach(IObserver::update);
    }
}
