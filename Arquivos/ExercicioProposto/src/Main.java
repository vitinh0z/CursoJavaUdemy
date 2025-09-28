import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Products> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String filePath = scanner.nextLine();


        File sourceFIle = new File(filePath);
        String sourceFolder = sourceFIle.getParent();

        boolean sucess = new File(sourceFolder + "\\out").mkdir();

        if (!sucess){
            System.out.print("Erro");
        }


        String targetFile = sourceFolder + "\\out\\summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFIle))){
            String itemCSV = bufferedReader.readLine();
            while (itemCSV != null){
            String[] fields = itemCSV.split(",");
            String name = fields[0];
            double price = Double.parseDouble(fields[1]);
            int quantity = Integer.parseInt(fields[2]);

            list.add(new Products(name, price, quantity));

            itemCSV = bufferedReader.readLine();
            }

            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile, true))){
                for (Products item : list){
                    bufferedWriter.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bufferedWriter.newLine();

                }

                System.out.println("Created: " + targetFile);

            } catch (IOException e){
                System.out.println("ERRO:  " + e.getMessage());
            }

        } catch (IOException e){
            System.out.println("ERRO writing file: " + e.getMessage());
        }



    }
}