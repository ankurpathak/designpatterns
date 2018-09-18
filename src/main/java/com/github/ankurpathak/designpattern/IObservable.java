package com.github.ankurpathak.designpattern;

public interface IObservable {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void broadcast(); //notify()
}
