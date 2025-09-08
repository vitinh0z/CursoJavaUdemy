package Composicao.SalarioFuncionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner read = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("NOME DO DEPARTAMENTO: ");
        String nomeDepartamento = read.nextLine();

        System.out.println("ENTRE COM DADOS DO TRABALHADOR:");
        System.out.print("NOME: ");
        String nomeTrabalhador = read.nextLine();

        System.out.print("LEVEL DO FUNCIONARIO (JUNIOR, MID_LEVEL, SENIOR): ");
        String levelTrabalhador = read.nextLine();

        System.out.print("SALARIO BASE: ");
        double salarioBase = read.nextDouble();
        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, salarioBase, CargoFuncionario.valueOf(levelTrabalhador), new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos para este trabalhador? ");
        int quantidadeContratos = read.nextInt();

       
        for (int i = 0; i < quantidadeContratos; i++) {
            System.out.println("ENTRE COM CONTRATO #" + (i + 1) + " data:");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(read.next());
            System.out.print("Valor por hora: ");
            double valorHora = read.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = read.nextInt();

            ContratoHoras contrato = new ContratoHoras(dataContrato, valorHora, horas);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println();

        System.out.print("Entre com mes e ano para calcular ganhos (MM/YYYY): ");
        String mesEAno = read.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("NOME: " + trabalhador.getNome());
        
        System.out.println("DEPARTAMENTO: " + trabalhador.getDepartamento().getName());
        System.out.println("Ganhos para " + mesEAno + ": " + String.format("%.2f", trabalhador.inCome(ano, mes)));

        read.close();
    }
}