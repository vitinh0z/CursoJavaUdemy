package Vetores.MediaPares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
        Scanner read = new Scanner(System.in);


        System.out.print("Digite quantidade de elementos no VetorA: ");

        int quantidade = read.nextInt(); 

        Numeros[] vetorA = new Numeros[quantidade];

        int numeros;

        for (int i = 0; i<vetorA.length; i++) {

            System.out.printf("Digite o %d° do vetorA: ", i+1);
            numeros = read.nextInt();

            vetorA[i] = new Numeros(numeros);
        }

        int pares = 0;
        int soma;

        for (int i = 0; i<vetorA.length; i++){

           

            if (vetorA[i].isPar()){

                
                pares++;
                soma = pares += vetorA[i].getNumeros();
                
            }
            
        }


        int media = soma / pares;

        if (pares > 0){
            System.out.println("A Média dos pares são: " + media);

        }

        else{
            System.out.println("Não tem pares");
           

        }
     

       


    }
}
