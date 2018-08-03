package com.github.ankurpathak.designpattern;

public class Main {
    public static void main(String[] args) {
        Duck simpleDuck = new Duck(new SimpleFlyBehaviour(), new SimpleQuackBehaviour(), new SimpleDisplayBehaviour());
        simpleDuck.display();
        simpleDuck.quack();

    }
}
