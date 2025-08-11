package OrientaçãoAObjetos.Exercicios;
import java.util.Scanner;

public class Estoque {
    public static void main (String[] args) {

    Scanner read = new Scanner (System.in);


    Products products = new Products();

    System.out.println("Enter product data: ");
    System.out.println("Name: ");
    products.name = read.nextLine();

    System.out.print("Price: ");
    products.price = read.nextDouble();

    
    System.out.print("Quantity in Stock: ");
    products.quantity = read.nextInt();


    System.out.print("Product data " + products);

        
    System.out.println("Enter the number of produts to be added in stock: "); 
    int quantity = read.nextInt();
    products.addProducts(quantity);

     System.out.print("Update data " + products);

        
    System.out.println("Enter the number of produts to be removed in stock: "); 
    quantity = read.nextInt();
    products.removeProducts(quantity);

    System.out.print("Product data " + products);

    read.close();

    }
}
