package com.github.ankurpathak.designpattern;

//Observable
public interface IObservable {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void broadcast(); //notify()
}
