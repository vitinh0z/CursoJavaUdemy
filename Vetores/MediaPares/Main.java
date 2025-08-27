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
        int soma = 0;

        for (int i = 0; i<vetorA.length; i++){
            if (vetorA[i].isPar()){
                System.out.printf("Media dos Pares: %d", (soma+=vetorA[i].getNumeros()) / vetorA.length);

            }    
            else {
                System.out.println("Não tem numeros pares");
            }
        }

        
       

        










    }
}