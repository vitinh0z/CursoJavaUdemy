package Vetores.MediaProdutos;

import java.util.Scanner;

import OrientaçãoAObjetos.Contrutores.Products;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner (System.in);

        System.out.printf("Digite quantidade de produtos");
        int n = read.nextInt();
        Products[] vect = new Products[n];

        read.nextLine();
        for (int i = 0; i<vect.length; i++){

            

            System.out.println("Digite o nome: ");
            String nome = read.nextLine();

            System.out.print("Digite o preço:R$ ");
            double preco = read.nextDouble();

            read.nextLine();

            vect[i] = new Products(nome, preco);
        }

        double soma = 0.0;

        for (int i = 0; i<vect.length; i++){
            soma += vect[i].getPrice();
        }

        double media = soma/n;

        read.close();

        System.out.printf("Media de preço é: %.2f\n", media);




        







    }


}
