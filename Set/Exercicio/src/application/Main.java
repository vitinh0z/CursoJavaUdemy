package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\victo\\Downloads\\CursoJavaUdemy\\Set\\Exercicio\\src\\out";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){


            Set<LogEntry> set = new HashSet<>(); // mais rapido e nao precisa de ordem

            String line =  bufferedReader.readLine();

            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(username, moment));

                line = bufferedReader.readLine();
            }

            System.out.println("TOTAL USER: " + set.size());


        } catch(IOException e ){
            System.out.println("ERRO: " + e.getMessage());
        }


    }
}