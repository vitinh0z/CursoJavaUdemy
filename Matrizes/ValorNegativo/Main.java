package Matrizes.ValorNegativo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
    Scanner read = new Scanner(System.in);


        

        System.out.println("Digite tamanho da matriz");
        int quantidade = read.nextInt();

        int[][] mat = new int[quantidade][quantidade];

        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                mat[i][j] = read.nextInt();
            }
        }

        System.out.println("Diagonal: ");

        for (int i = 0; i<mat.length; i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int numerosNegativo = 0;

        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat[i].length; j++){
                if (mat[i][j] < 0){
                    numerosNegativo++;

                }
            }
        }

        System.out.println("NUmeros negativos: " + numerosNegativo);





}       


}
