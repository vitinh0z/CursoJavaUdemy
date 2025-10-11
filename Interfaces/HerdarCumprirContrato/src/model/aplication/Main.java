package model.aplication;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangule;
import model.entities.Shape;
import model.enums.Color;

public class Main {

    public static void main (String[] args){


        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangule(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle Color: " + s1.getColor());
        System.out.println("Area circulo: " + s1.area());

        System.out.println();

        System.out.println("Circle Color: " + s2.getColor());
        System.out.println("Area retangulo: " + s2.area());

    }
}
