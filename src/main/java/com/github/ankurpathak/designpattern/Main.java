package com.github.ankurpathak.designpattern;

//Helps to avoid class explosion
//Help avoids use of conditionals and will violate interface segregation principal
//Example Stream And Reader api in Java
//Like a linked list
//Substitute for inheritance i.e. is runtime inheritance.
public class Main {
    public static void main(String[] args) {
        Expresso expresso = new Expresso();
        CaramelDecorator caramelDecorator = new CaramelDecorator(expresso);
        System.out.printf("Cost: %d", caramelDecorator.cost());
    }
}
