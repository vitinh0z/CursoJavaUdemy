package Composicao.SalarioFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        
        Scanner read = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("NOME DO DEPARTAMENTO: ");
        String departamento = read.nextLine();

        System.out.println("ENTRE COM NOME DO FUNCIONARIO: ");
        String nome = read.nextLine();

        System.out.println("ENTRE COM LEVEL DO FUNCIONARIO: ");
        String Leveltrabalhador = read.nextLine();

        System.out.println("ENTRE COM SALARIO: ");
        double salarioBase = read.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nome, salarioBase, CargoFuncionario.valueOf(Leveltrabalhador), new Departamento(departamento));





        System.out.println("Quantos contratos vão ter: ");
        int quantidade = read.nextInt();

        for (int i = 0; i<=quantidade;i++){
            System.out.println("ENTRE COM CONTRATO " + i+1 + "data: ");
            System.out.println("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(read.next());
            System.out.println("Valor por hora: ");
            double valorHora = read.nextDouble();
            System.out.println("Duração (por hora): ");
            int horas = read.nextInt();

            ContratoHoras contratos = new ContratoHoras(dataContrato, valorHora, horas);
            trabalhador.adicionarContrato(contratos);
        }

        System.out.println();

        System.out.println("Entre como mes e ano do contrato: (MM/YYY): ");
        String mesEAno = read.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("NOME: " + trabalhador.getNome());
        System.out.println("DEPARTAMENTO: " + trabalhador.getDepartamento());
        System.out.println("Ganhou: " + mesEAno + ":" + String.format("%.2f", trabalhador.inCome(ano, mes)));





    }
    
}
