import java.util.Scanner;

public class TresNumerosMaiores {
    
    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);


        
        System.out.println("Enter three numbers: ");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int num3 = read.nextInt();

        int higher = max(num1, num2, num3);

        showResult(higher);


        read.close();

    }


    public static int max (int x, int y, int z){
        int aux;
        if (x > y && x > y){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else {
            aux = x;
        }

        return aux;
    }

    public static void showResult (int value){

        System.out.println("Higher = " + value);


        
    }

}
