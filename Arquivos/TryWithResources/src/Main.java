import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\victo\\Downloads\\in.txt.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            // salva intelli
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}