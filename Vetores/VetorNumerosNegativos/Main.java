package Vetores.VetorNumerosNegativos;
    

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        int quantidade;
        
        
        do {

            System.out.print("Digite a quantidade de números a serem digitados: ");
            quantidade = read.nextInt();


            if (quantidade >= 10) {

                System.out.println("Quantidade não pode ser mais que 10");
            
            }

            else if (quantidade <= 0) {

                System.out.println("Quantidade deve ser positivo e maior que zero");

            }

        } while (quantidade >= 10 || quantidade <= 0);
        
        Numeros[] vetor = new Numeros[quantidade];
        

        read.nextLine();

        for (int i = 0; i<vetor.length; i++){

            System.out.printf("Digite o %d º Número: ", i+1);
            int numeros = read.nextInt();

            vetor[i] = new Numeros(numeros);

        }

        read.close();

        for (int i = 0; i<vetor.length;i++){
            if (vetor[i].numeroNegativo()){
                System.out.printf("O número %d é Negativo\n", vetor[i].getNumeros());
            }
            else if (vetor[i].NumeroPositivo()){
                System.out.printf("Numero %d é positivo\n", vetor[i].getNumeros());
            }
            else {
                System.out.printf("O número %d é neutro\n", vetor[i].getNumeros());
            }

        }



    }

    
    

}
