package com.github.ankurpathak.designpattern;

import java.util.ArrayList;
import java.util.List;


//Concrete Observable
public class WeatherStation extends AbstractObservable implements IObservable {


    private int tempearature;


    public int getTempearature() {
        return tempearature;
    }

    public void setTempearature(int tempearature) {
        this.tempearature = tempearature;
        broadcast();
    }

    public WeatherStation() {
    }


}
