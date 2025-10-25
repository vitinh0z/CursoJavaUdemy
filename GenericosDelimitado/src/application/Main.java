package application;

import Services.CalculationService;
import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\victo\\Downloads\\CursoJavaUdemy";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] filds = line.split(",");
                list.add(new Product(filds[0], Double.parseDouble(filds[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("MAX " + x);

        } catch (IOException e){
        System.out.print("ERRO: " + e.getMessage());
        }





    }
}
