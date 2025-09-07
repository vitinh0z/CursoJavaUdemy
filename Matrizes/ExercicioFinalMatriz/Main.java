package Matrizes.ExercicioFinalMatriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int linhas = read.nextInt();


        System.out.println("Digite a quantidade de linhas: ");
        int colunas = read.nextInt();

        int[][] mat = new int[linhas][colunas];

        for(int i = 0; i<mat.length; i++){
            for (int j = 0; i<mat.length; j++){
                mat[i][j] = read.nextInt();
            }
        }

        System.out.println("Digite um numero inteiro: ");
        int x = read.nextInt();

        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat.length; i++){
                if (mat[i][j] == x){
                    System.out.println("X é igual na posição: " + i + "e" + j);
                }
                if (j>0){
                    System.out.println("Esquerda: " + mat[i][j-1]);
                }
                if (i>0){
                    System.out.println("Cima: " + mat[i-1][j]);
                }
                if (j<mat[i].length-1){
                    System.out.println("Direita: " + mat[i][j+1]);
                }
                if (i<mat.length-1){
                    System.out.println("Baixo: " + mat[i+1][j]);
                }
            }
        }

        // Esse tive que pegar a resposta pq não tava conseguindo entender e como fazer ;-;




    }
    
}
