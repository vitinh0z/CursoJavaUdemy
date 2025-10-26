package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args){
        List<Integer> myInts = Arrays.asList(5,1,10);
        printlist(myInts);
        List<String> myStrs = Arrays.asList("maria", "jose", "Ana");
        printlist(myStrs);


    }

    public static void printlist(List<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
