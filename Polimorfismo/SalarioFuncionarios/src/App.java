import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner read = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de Funcionarios: ");
        int quantidade = read.nextInt();


        read.nextLine();

        List<Funcionarios> list = new ArrayList<>();

        for (int i = 0; i<quantidade ;i++){

            System.out.printf("Empregado %dº", i+1);
            System.out.println("Funcionario é Terceirizado? (s/n): ");
            char opcao = read.nextLine().charAt(0);

           

            System.out.println("Nome: ");
            String nome = read.nextLine();

            

            System.out.println("Horas: ");
            int horas = read.nextInt();

            System.out.println("Valor por horas: ");
            double valorHora = read.nextDouble();


            switch (opcao) {

                case 's':

                    System.out.println("Taxa adicional: ");
                    double adicional = read.nextDouble();
                    read.nextLine();
                    list.add(new FuncionariosTerceiros(nome, horas, valorHora, adicional));

                break;

                case 'n':

                    list.add(new Funcionarios(nome, horas, valorHora));

                break;
            
                default:

                    System.out.println("Opção Invalida");

                break;
            }

            read.close();

            for (Funcionarios funcionarios : list) {

                System.out.println(funcionarios.getNome() + " " + funcionarios.pagamento());
            }
        }

        for (Funcionarios funcionarios : list) {
            
            System.out.println(funcionarios);
        }

    }
}
