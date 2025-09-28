import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\victo\\Downloads\\in.txt.txt");

        try (Scanner read = new Scanner(file)) {

            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());
        }

    }
}