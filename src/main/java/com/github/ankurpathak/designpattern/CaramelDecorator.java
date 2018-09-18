package com.github.ankurpathak.designpattern;

//Concrete Decorator
public class CaramelDecorator extends AddOnDecorator {
    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 2 + super.getBeverage().cost();
    }
}
