package com.github.ankurpathak.designpattern;

import java.util.ArrayList;
import java.util.List;

//Abstract Observable
//In order to avoid violation of single responsibility
public abstract class  AbstractObservable implements IObservable {

    private final List<IObserver> observers;

    protected AbstractObservable() {
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
