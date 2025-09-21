package MetodosAbstratos.CalculoImposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        List<TaxPayer> list = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas: ");
        int quantidade = read.nextInt();

        for (int i = 0; i<quantidade;i++){

            System.out.println("Pessoa Fisica ou Empresa? (f/e)");
            char opcao = read.nextLine().charAt(0);

            System.out.printf("Digite o %d Funcionario: ", i+1);
            System.out.println("Nome: ");
            String nome = read.nextLine();

            System.out.println("Anual Income: ");
            double anualCome = read.nextDouble();

            switch (opcao) {
                case 'f':

                    System.out.println();
                    
                break;

                case 'j':

                break;
            
                default:
                    break;
            }

        }



    }
    
}
