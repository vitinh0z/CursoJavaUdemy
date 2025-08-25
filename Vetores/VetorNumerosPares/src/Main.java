
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int quantidade;

        do {
        
            System.out.print("DIgite a quantidade de numeros a serem digitados: ");
            quantidade = read.nextInt();

            if (quantidade <= 0){
                System.out.println("A quantidade deve ser maior que zero");
            }

        } while (quantidade <=0 );

        Numeros[] vetor = new Numeros[quantidade];

        for (int i = 0; i<vetor.length; i++){
            System.out.printf("Digite o %d° Número: ", i+1);
            int numero = read.nextInt();

            vetor[i] = new Numeros(numero);
        }

        read.close();

        Verificador.verificador(vetor);

       

        
    }
}
