import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Mornign", "Good Afternoon", "Good Night"};

        String path = "C:\\Users\\victo\\Downloads\\out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){

            for (String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}