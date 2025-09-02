package Listas.Exercicio;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        System.out.println("Quantos funcionarios serão registrados: ");
        int quantidade = read.nextInt();

        List<Funcionarios> list = new ArrayList<>(quantidade);

        read.nextLine();

        for (int i = 0; i<quantidade; i++){

            System.out.printf("Empregado %d\n",i+1);
            System.out.printf("Digite o Id do Funcionario: ",i+1);
            int id = read.nextInt();
            
            read.nextLine();

            System.out.printf("Digite o nome do Funcionario: ",i+1);
            String nome = read.nextLine();

            System.out.printf("Digite o salario do funcionario: ",i+1);
            Double salario = read.nextDouble();
            
           
            Funcionarios funcionarios = new Funcionarios(nome, id, salario);

            list.add(funcionarios);
  
        }

        System.out.println("\nEntre com ID do funcionario que gostaria de acessar: ");
        int request = read.nextInt();

        Funcionarios result = list.stream().filter(x -> x.getId() == request).findFirst().orElse(null);

        read.close();


        if (result != null){
        System.out.printf("\nFuncionario Encontrado: ID: %d | Nome: %s | Salario: %.2f\n", result.getId(), result.getNome(), result.getSalario());
        }
        
        else {
        System.out.println("Funcionario não encontrado");
        }


        System.out.println("Funcionarios");
        for (Funcionarios x : list){
            System.out.println(x.toString());
        }



    }
    
}
