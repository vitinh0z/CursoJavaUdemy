package MetodosAbstratos.CalculoArea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Entre com a quantidade de formas: ");
        int quantidade = read.nextInt();

        read.nextLine();

        for (int i = 0; i<quantidade; i++){


        System.out.println("Figura " + i +"º");

        System.out.println("Retangulo ou Circulo (r/c)");
        char opcao = read.nextLine().charAt(0);

        System.out.println("Cor (BLACK/BLUE/RED)");
        Color color = Color.valueOf(read.next());


        switch (opcao) {
            case 'r':

            System.out.println("Altura: ");
            double height = read.nextDouble();

            System.out.println("Largura: ");
            double width = read.nextDouble();

            list.add(new Rectangule(color, width , height));

            break;


            case 'c':

                System.out.println("Raio: ");
                double radius = read.nextDouble();

                list.add(new Circle(color, radius));

            break;

            default:
                break;
        }

        read.nextLine();

        System.out.println();

        System.out.println("Areas das formas: ");

        for (Shape shape : list) {
            System.out.printf("COR: %s%n | Area: %f" + shape.getColor(), shape.area());
        }



        }
    }
    
}
