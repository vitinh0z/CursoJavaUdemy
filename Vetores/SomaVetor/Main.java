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
            int numero = read.nextInt();

            vetor[i] = new Numero(numero);

        }

        int soma = 0;
        for (int i = 0; i<vetor.length;i++){
            soma += vetor[i].getNumero();

        }
        System.out.println("A soma é: " + soma);








    }




    
}
