package application;


import entities.PrintService;


import java.util.Scanner;

public class Main {

    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.println("How Many Value: ");
        int n = scanner.nextInt();

        for (int i = 0; i<n;i++){
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("First: " + printService.first());


    }
}
