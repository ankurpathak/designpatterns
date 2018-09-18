package com.github.ankurpathak.designpattern;


//Client
//1. Its a push pattern instead of poll
//2. Its a push-pull variant instead of poll-pull(So Concrete observer has concrete observable)
//3. Other variant can be push only. Then update method will have data observer is interested into by argument.
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
