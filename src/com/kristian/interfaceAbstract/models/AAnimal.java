package com.kristian.interfaceAbstract.models;

// Abstract Class - marked by keyword: abstract
// Can inherit from both: Interface & Abstract classes
// TODO - Test visibility mod
public abstract class AAnimal {

    // Includes abstract, excludes body {}
    protected abstract void eat();

    // Ordinary method - excludes abstract
    public void makeSound(){
        System.out.println("Some random animal noise");


    }

}
