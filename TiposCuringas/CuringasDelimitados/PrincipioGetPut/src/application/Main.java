package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args){

        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDouble = Arrays.asList(3.15, 6.21);

        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        copy(myDouble, myObjs);
    }

    public static void copy (List < ? extends Number> source, List<? super Number> destiny){
        for (Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.println("OBJ: " + obj );
        }
        System.out.println();
    }
}
