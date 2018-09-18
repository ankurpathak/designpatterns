package com.github.ankurpathak.designpattern;
//Concrete Decorator
public class SoyDecorator extends AddOnDecorator{
    public SoyDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 1;
    }
}
