package Polimorfismo.ProdutosImportados;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        Scanner read = new Scanner(System.in);

        System.out.print("Entre com a quantidade de produtos: ");
        int quantidade = read.nextInt();

        read.nextLine();

        List<Produto> list = new ArrayList<>();

        for (int i = 0; i <= quantidade; i++) {
            System.out.println("Produto é: (C)omum (U)sado (I)mportado");
            char escolha = read.nextLine().charAt(0);

            System.out.printf("Produto %d°", i + 1);

            System.out.print("Nome: ");
            String nome = read.nextLine();

            System.out.print("Preço: ");
            Double preco = read.nextDouble();
                    

            read.nextLine();

            if (escolha == 'u'){

                System.out.println("Data de fabrição: ");
                String dataFabricacao = read.nextLine(); // ------> sei la fazer isso ;-;
                Date datafabricacao = format.parse(dataFabricacao);
                
                list.add(new ProdutosUsados(nome, preco, datafabricacao));
            }


            else if(escolha == 'i'){ 
                
                Double taxaImportacao = read.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxaImportacao));
                
            }  

            else {
                System.out.println("opcao invalida");
            }


        }

        for (Produto produto : list) {
            System.out.println(produto);
        }

    }

}
