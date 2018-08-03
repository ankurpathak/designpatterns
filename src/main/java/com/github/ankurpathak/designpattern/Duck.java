package com.github.ankurpathak.designpattern;

import java.io.Serializable;

public class Duck implements Serializable {
    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;
    private IDisplayBehaviour displayBehaviour;

    public Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour, IDisplayBehaviour displayBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.displayBehaviour = displayBehaviour;
    }


    public void fly(){
        this.flyBehaviour.fly();
    }

    public void quack(){
        this.quackBehaviour.quack();
    }

    public void display(){
        this.displayBehaviour.display();
    }
}
