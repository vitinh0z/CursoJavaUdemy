package OrientaçãoAObjetos.Exercicios;

import java.util.Scanner;

public class areaTrianguloSemOOP {
     public static void main (String[] args){


        Scanner read = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();




        System.out.println("Entre com os lados do triagulo X: ");
        x.a = read.nextDouble();
        x.b = read.nextDouble();
        x.c = read.nextDouble();


        System.out.println("Entre com os lados do triagulo Y: ");
        y.a = read.nextDouble();
        y.b = read.nextDouble();
        y.c = read.nextDouble();


        double areaY = y.area();

        double areaX = x.area();


        System.out.println("Triangulo X = " + areaX);
        
        System.out.println("Triangulo Y = " + areaY);

        if (areaX > areaY){
            System.out.println("Triangul X é Maior");
        }
        else {
            System.out.println("Triangulo Y é maior");
        }

    read.close();

    }



}
