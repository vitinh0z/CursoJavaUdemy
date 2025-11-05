package org.example;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Department obj = new Department(1, "Books");
        System.out.println(obj);

        SellerDao sellerDao = DaoFactory.createSelleDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);


        System.out.println("==== TEST 2: seller findByDepartment ====");

        Department department = new Department(2, null);

        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller x : list){
            System.out.println(x);
        }

        System.out.println("==== TEST 3: seller findByDepartment ====");

        list = sellerDao.findAll();

        for (Seller x : list){
            System.out.println(x);
        }

        System.out.println("==== TEST 4: seller findByDepartment ====");

        Seller newSeller = new Seller (null, "Victor", "victor10.vg23@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);

        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("==== TEST 5: seller update ====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("==== TEST 6: seller delete ====");
        System.out.println("entre com id for delete teste: ");
        int id = scanner.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        scanner.close();


    }
}