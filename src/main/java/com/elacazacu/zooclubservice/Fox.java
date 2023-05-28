package com.elacazacu.zooclubservice;

public class Fox extends Animal {
    public Fox(String name){
        super(name);
    }

    public void eat(){
        System.out.println(this.getName() + " eats chicken!");
    }

    public void makeSound(){
        System.out.println(getName() + " psss pss!");
    }
}