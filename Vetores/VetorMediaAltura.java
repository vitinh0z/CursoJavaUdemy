package Vetores;

import java.util.Scanner;

public class VetorMediaAltura {

    public static void main(String[] args) {
        
    

    Scanner read = new Scanner (System.in);

    int n = read.nextInt();
    double[] vect = new double[n];
    

    double soma = 0.0;
    for (int i =0; i<n; i++){
        vect[i] = read.nextDouble();
        soma += vect[i];
    }
    double media = soma / n;

    read.close();


    System.out.printf("Media de altura: %.2f", media);
}
}