import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String filePath = scanner.nextLine();

        File path = new File(filePath);

    // Mostra Pastas:

        File[] folders = path.listFiles(File::isDirectory); // cria um vetor de file com nome das pastas do caminho

        System.out.println("FOLDER: ");

        for (File folder : folders) {
            System.out.println(folder);
        }

    // -----------------------------------------------------------

    // Mostras arquivos:
        File[] files = path.listFiles(File::isFile);

        for (File file : files){
            System.out.print(file);
        }
   // ----------------------------------------------


        // Cria pastas:
        boolean sucess = new File (filePath + "\\subdir").mkdir();
        System.out.println("DIRETORIO CRIADO: " + sucess);
    }
}