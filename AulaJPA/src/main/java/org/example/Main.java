package org.example;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {

       EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
       EntityManager entityManager = entityManagerFactory.createEntityManager();


       try {
           Pessoa p = entityManager.find(Pessoa.class, 2);
           entityManager.getTransaction().begin();

           if (p == null){
               System.out.println("Pessoa do ID 2 nao foi encontrada");
               entityManager.close();
               return;
           }
           else {
               entityManager.remove(p);
               entityManager.getTransaction().commit();
           }
       } catch (Exception e){
          if (entityManager.getTransaction().isActive()){
              entityManager.getTransaction().rollback();
          }
          e.printStackTrace();
       }

       finally {
           entityManager.close();
           entityManagerFactory.close();
       }
    }
}