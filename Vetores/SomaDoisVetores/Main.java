package Vetores.SomaDoisVetores;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        int quantidade;

        Scanner read  = new Scanner(System.in);

        System.out.print("Digite a quantidade a ser digitada no vetorA e VetorB: ");
        quantidade = read.nextInt();

        Numeros[] vetorA = new Numeros[quantidade];
        Numeros[] vetorB = new Numeros[quantidade];

        for (int i = 0; i<vetorA.length; i++){
            System.out.printf("Digite o %d° valor do vetorA: ", i+1);
            vetorA[i].getNumerosA();
        }

        for (int i = 0; i<vetorB.length; i++){
            System.out.printf("Digite o %d° valor do vetorB: ", i+1);
            vetorB[i].getNumerosB();
        }

        for (int i=0; i<vetorA.length; i++){
            vetorA[i]
        }

        













    }    
}
