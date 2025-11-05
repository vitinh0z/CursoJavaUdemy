package org.example;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Department obj = new Department(1, "Books");
        System.out.println(obj);

        SellerDao sellerDao = DaoFactory.createSelleDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);



    }
}