package SalarioEmpregado;
import java.util.Scanner;


public class SalarioEmpregado {
    

    public static void main(String[] args) {
        
    

    Scanner read = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();


    System.out.print("Nome do Funcionario: \n");
    funcionario.setNome(read.nextLine());

        
    boolean salarioBrutoValido = false;
    do {
    try {

        System.out.print("Salario Bruto do Funcionario: \n");
        funcionario.setSalarioBruto(read.nextDouble());
        salarioBrutoValido = true;


    } catch (IllegalArgumentException erroSalario){

        System.out.println(erroSalario.getMessage());
    }
    } while (salarioBrutoValido == false);

    
    boolean salarioValido = false;
    do {

    try {
    System.out.print("Digite imposto: \n");
    funcionario.setImposto(read.nextDouble());
    salarioValido = true;

    } catch (IllegalArgumentException erroImposto){

        
        System.out.println(erroImposto.getMessage());
        
    }
    } 
    while (salarioValido == false);
    System.out.print("Digite porcentagem de aumento: \n");
    funcionario.setAumento(read.nextDouble());

    read.close();

    System.out.println(funcionario);




}
}