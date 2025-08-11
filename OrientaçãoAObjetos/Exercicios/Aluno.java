package OrientaçãoAObjetos.Exercicios;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        MediaNota nota = new MediaNota();


        System.out.println("Digite a primeira nota: ");
        nota.setNota1(read.nextFloat());

        System.out.println("Digite a segunda nota: ");
        nota.setNota2(read.nextFloat()); 

        System.out.println("Digite a terceira nota: ");
        nota.setNota3(read.nextFloat());

        read.close();
        
        System.out.println(nota);

    }
}
