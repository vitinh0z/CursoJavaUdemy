package OrientaçãoAObjetos.MetodosEstaticos;

import java.util.Scanner;

public class Versao1 {

    public  final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        System.out.print("Digite valor do raio: ");
        double raio = read.nextDouble();


        double c = Versao1Calculator.circuferencia(raio);
        double v = Versao1Calculator.volume(raio);


        System.out.printf("Circuferencia = %.2f\n", c);
        System.out.printf("Volume: %.2f", v);
        System.out.printf("Valor do PI: %.2f", Versao1Calculator.PI);

    }



}