package com.github.ankurpathak.designpattern;

//Add on decorator
//To Support Single Responsibility Principal
public abstract class AddOnDecorator {

    private Beverage beverage;

    public abstract int cost();

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
