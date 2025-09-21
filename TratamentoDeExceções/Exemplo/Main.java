package TratamentoDeExceções.Exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    
        Scanner read = new Scanner(System.in);

        try{
            String[] vect = read.nextLine().split(" ");
            int position = read.nextInt();
            System.out.println(vect[position]);
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao Invalida");
        }
        catch (InputMismatchException e){
            System.out.println("Erro na entrada");
        }
        System.out.println("Fim do programa");
    }
}
