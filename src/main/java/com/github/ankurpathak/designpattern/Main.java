package com.github.ankurpathak.designpattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WindowDisplay windowDisplay = new WindowDisplay(weatherStation);
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.setTempearature(25);

        weatherStation.addObserver(windowDisplay);
        weatherStation.addObserver(phoneDisplay);
        weatherStation.setTempearature(36);

        weatherStation.setTempearature(89);
    }
}
