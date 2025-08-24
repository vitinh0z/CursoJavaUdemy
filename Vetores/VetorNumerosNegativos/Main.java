package Vetores.VetorNumerosNegativos;
    

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int quantidade;
        Scanner read = new Scanner(System.in);

        Numeros numeros = new Numeros(0);

        boolean opcao = false;

        System.out.println("Digite quantidade de números: ");
        quantidade = read.nextInt();

        if (quantidade > 10){  
            opcao = true;
            do {

                System.out.println("Quantidade deve ser menor que 10");

            } while (opcao == true);

        }
       

       
       

       



    }

    

}
