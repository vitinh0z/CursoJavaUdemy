package Vetores.VetorDadosPessoais;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);


        System.out.println("Quantas pessoas serão cadastradas: ");
        int quantidade = read.nextInt();

        Pessoas[] vetor = new Pessoas[quantidade];

        for (int i = 0; i<vetor.length; i++){

            System.out.printf("Altura da %d° pessoa: ", i+1);
            double altura = read.nextDouble();

            read.nextLine();


            System.out.printf("Genero da %d° Pessoas: ", i+1);
            String genero = read.nextLine();

            vetor[i] = new Pessoas(altura, genero);
        }


        double maior = 0.0;
        double soma = 0.0;
        for (int i = 0; i<vetor.length;i++){
            if (maior < vetor[i].getAltura() ){
                maior = vetor[i].getAltura();
            }
        soma += vetor[i].getAltura();
        }

        double media = soma/vetor.length;

        System.out.printf("\nMaior altura: %.2f\n", maior);
        System.out.printf("\nA media de altura foi: %.2f", media);    











    }
  
}
