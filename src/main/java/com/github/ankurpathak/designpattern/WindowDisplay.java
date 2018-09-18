package com.github.ankurpathak.designpattern;

public class WindowDisplay implements IObserver, IDisplay {

    private final WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }


    @Override
    public void update() {
        display(weatherStation.getTempearature());
    }

    @Override
    public void display(int temperature) {
        System.out.printf("Temperature on Window Display: %d%n", temperature);

    }
}
