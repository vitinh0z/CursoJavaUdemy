
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        
        
        System.out.print("DIgite a quantidade de numeros a serem digitados: "); int quantidade = read.nextInt();

        Numeros[] vetor = new Numeros[quantidade];

        for (int i = 0; i<vetor.length; i++){
            System.out.printf("Digite o %d° Número: ",i+1);
            int numero = read.nextInt();

            vetor[i] = new Numeros(numero);
        }

        
    }
}
