package OrientaçãoAObjetos.MetodosEstaticos;


import java.util.Scanner;

public class CotacaoDolar {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);


        System.out.println("Qual valor do dolar: ");
        double valorDolar = read.nextDouble();

        System.out.println("Valor do produto em dolares: ");
        double precoProduto = read.nextDouble();

        double impostoCalculado = CalculoDolar.valorImposto(valorDolar, precoProduto);
        double valorFinal = CalculoDolar.valorReais(impostoCalculado, precoProduto, valorDolar);

        System.out.printf("Valor a ser pago no produto é %.2f", valorFinal);





    }



}
