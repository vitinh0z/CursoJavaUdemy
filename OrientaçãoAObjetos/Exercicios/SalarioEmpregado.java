package OrientaçãoAObjetos.Exercicios;

import java.util.Scanner;

public class SalarioEmpregado {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        Funcionario funcionario = new Funcionario();

        System.out.println("Nome do Funcionario: ");
        funcionario.setNome(read.nextLine());

        System.out.println("Salario: ");
        funcionario.setSalarioBruto(read.nextDouble());

        
        System.out.println("Imposto: ");
        funcionario.setImposto(read.nextDouble());

        System.out.println("Porcentagem a ser aumentada: ");
        funcionario.setAumento(read.nextDouble());
        read.close();

        System.out.println(funcionario);










        
    }


    


    
}
