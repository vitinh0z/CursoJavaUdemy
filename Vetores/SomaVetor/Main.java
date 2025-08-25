package Vetores.SomaVetor;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.printf("Digite a quantidade de numero a serem digitados: ");
        int quantidade = read.nextInt();

        Numero[] vetor = new Numero[quantidade];

        for (int i = 0; i<vetor.length; i++){
            System.out.printf("Digite o %dº Número: ", i+1);
            double numero = read.nextDouble();

            vetor[i] = new Numero(numero);

        }

        read.close();

        double soma = Calculadora.calcularSoma(vetor);
        double media = Calculadora.calcularMedia(vetor);


        System.out.println("A soma é: " + soma);
        System.out.printf("A média é %.2f", media);

    }

    




    
}
