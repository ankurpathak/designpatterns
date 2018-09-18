package com.github.ankurpathak.designpattern;

public class PhoneDisplay implements IObserver, IDisplay {

    private final WeatherStation weatherStation;


    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        display(weatherStation.getTempearature());
    }

    @Override
    public void display(int temperature) {
        System.out.printf("Temperature on Phone Display: %d%n", temperature);
    }
}
