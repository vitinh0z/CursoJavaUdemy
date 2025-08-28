package Vetores.VetorDadosPessoais;
import java.lang.reflect.Array;
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


        Array.sort(vetor[i].getAltura());
            











    }
  
}
