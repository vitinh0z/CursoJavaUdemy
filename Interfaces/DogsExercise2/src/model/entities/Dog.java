package model.entities;

import services.Animal;

public class Dog implements Animal {


    @Override
    public void bark() {
        System.out.println("Latindo au au au au ua...");
    }
}
