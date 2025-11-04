package org.example;

import entities.Department;
import entities.Seller;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Department obj = new Department(1, "Books");
        System.out.println(obj);


        Seller seller = new Seller(21, "Bob Brown", " bob@gmail.com", new Date(), 300.0, obj);
        System.out.println(seller);

    }
}