/*  

Objetivo: Criar uma classe Aluno com nome e 3 notas.

Métodos:
media() → calcula a média das notas.
situacao() → retorna “Aprovado” ou “Reprovado”.
Extra: Permitir atualizar notas.

*/


import java.util.Scanner;
public class MediaNotas {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("DIgite o nome do aluno: ");
        aluno.setNome(read.nextLine());

        System.out.println("Digite a primeira nota: ");
        aluno.setNota1(read.nextFloat());

        
        System.out.println("Digite a segunda nota: ");
        aluno.setNota2(read.nextFloat());

        
        System.out.println("Digite a terceira nota: ");
        aluno.setNota3(read.nextFloat());

        read.close();
        
        System.out.println(aluno);







    }   
}
 
