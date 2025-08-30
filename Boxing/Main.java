package Boxing;

public class Main {
public static void main(String[] args) {
    

    // Boxing 
    int x = 20;
/*----> é um wrapper classes
elas tratam os tipos primitivos com classes */  Integer obj = x;
    System.out.println(obj);

    // unboxing
    int y = obj*2; 
    System.out.println(y);

    
    
}
}