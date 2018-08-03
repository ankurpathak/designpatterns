package com.github.ankurpathak.designpattern;

public class SimpleQuackBehaviour implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I quacked.");
    }
}
