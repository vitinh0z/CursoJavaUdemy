package Composicao.PedidoCliente;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        
        Scanner read = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");


        System.out.println("Digite o nome: ");
        String name = read.nextLine();

        System.out.println("Digite o email: ");
        String email = read.nextLine();

        System.out.println("Digite data de nascimento");
        String birthDate = read.nextLine();
        
        Cliente cliente = new Cliente(name, email, birthDate);




    }
    
}
