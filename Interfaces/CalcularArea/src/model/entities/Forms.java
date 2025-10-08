package model.entities;

import services.Area;

public abstract class Forms implements Area {


    public static double PI = Math.PI;


    @Override
    public String toString (){
        return "AREA: " + getArea();
    }

}
