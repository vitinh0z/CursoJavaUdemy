package TratamentoDeExceções.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        metodo1();
        System.out.println("Fim do programa");
    }




    public static void metodo1 (){
        System.out.println("COmeço do meotodo 1");
        metodo2();
        System.out.println("fim do meotodo 1");
        
    }

    public static void metodo2 (){
        System.out.println("metodo 2 começo");
        Scanner read = new Scanner (System.in);
        
        try{
            String[] vect = read.nextLine().split(" ");
            int position = read.nextInt();
            System.out.println(vect[position]);
        }
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posicao Invalida");
            e.printStackTrace();
            read.nextLine();
        }
        catch (InputMismatchException e){
            System.out.println("Erro na entrada");
        }

        read.close();
    }
    
}
