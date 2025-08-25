package OrientaçãoAObjetos.Contrutores;
import java.util.Scanner;

public class ExemploEstoque {

    public static void main (String[] args) {

    Scanner read = new Scanner (System.in);

    

    System.out.println("Enter product data: ");
    System.out.println("Name: ");
    String name = read.nextLine();

    System.out.print("Price: ");
    double price = read.nextDouble();
    Products product = new Products(name, price);
    

    System.out.print("Product data " + product);

        
    System.out.println("Enter the number of produts to be added in stock: "); 
    int quantity = read.nextInt();
    product.addProducts(quantity);

     System.out.print("Update data " + product);

        
    System.out.println("Enter the number of produts to be removed in stock: "); 
    quantity = read.nextInt();
    product.removeProducts(quantity);

    System.out.print("Product data " + product);

    read.close();

    }
}


    
