package aplication;

import model.entities.Circle;
import model.entities.Forms;
import model.entities.Rectangule;
import model.entities.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        boolean erro = false;

    do {

        try {


            Scanner scanner = new Scanner(System.in);

            int opcao;
            System.out.println("-------- CALCULADOR DE AREA DE FORMAS GEOMETRICAS ------------");
            do {
                System.out.println("Qual forma gostaria de calcula area: [1] - Circulo\n[2] - Retangulo\n[3] - Triangulo\n[4] - Sair\nOpção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:

                        System.out.println("Digite o raio da cincuferencia: ");
                        double raio = scanner.nextDouble();
                        Forms circle = new Circle(raio);

                        System.out.println(circle);
                        break;

                    case 2: {
                        System.out.println("Digite a lado do retangulo: ");
                        double lado = scanner.nextDouble();

                        System.out.println("Digite a altura do retangulo: ");
                        double altura = scanner.nextDouble();

                        Forms rectangule = new Rectangule(lado, altura);


                        System.out.println(rectangule);

                        break;
                    }

                    case 3: {

                        System.out.println("Digite a base do Triangulo: ");
                        double base = scanner.nextDouble();

                        System.out.println("Digite a altura do Triangulo: ");
                        double altura = scanner.nextDouble();

                        Forms triangle = new Triangle(base, altura);

                        System.out.println(triangle);
                        break;
                    }

                    case 4: {
                        System.out.println("saindo......");
                        break;
                    }

                    default: {

                        System.out.println("Opcao Invalida");
                    }
                    break;
                }

            } while (opcao != 4);


        } catch (InputMismatchException e) {

            System.out.println("ERRO: Digite um número");
            erro = true;
        }

    } while (erro);



    }
}