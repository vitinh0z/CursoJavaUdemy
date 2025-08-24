

import java.util.Scanner;



public class AreaRetangulo {
    public static void main (String[] args){

    Scanner read = new Scanner(System.in);


    rectangule rectangule = new rectangule();

    System.out.println("Enter rectangule widht and Height");
    
    System.out.print("Widht: ");
    rectangule.widht = read.nextDouble();
    
    System.out.print("Height: ");
    rectangule.height = read.nextDouble();
    
    read.close();

    System.out.printf("AREA = %.2f\n", rectangule.area());
    System.out.printf("PERIMETRO = %.2f\n", rectangule.Perimeter());
    System.out.printf("DIAGONAL = %.2f", rectangule.Diagonal());



    }
}
