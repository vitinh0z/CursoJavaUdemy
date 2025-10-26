package application;

import entities.Client;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {



        Client c1 = new Client("Victor", "victor10.vg23@gmail.com");

        Client c2 = new Client("Victor", "victor10.vg23@gmail.com");

        String s1 = "test";
        String s2 = "test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println(c1 == c2);
        System.out.println(s1 = s2);




    }
}