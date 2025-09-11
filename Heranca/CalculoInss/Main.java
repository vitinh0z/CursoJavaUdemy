package Heranca.CalculoInss;

public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Maicon", 21, "Masculino");
        Cliente cliente = new Cliente("Victor", 20, "Masculino", 200.00, 2005);
        Empregado empregado = new Empregado("Vitoria", 18, "Feminio", 1.800, "18219");
        Gerente gerente = new Gerente("Fabio", 44, "Masculino", 200.00, "7773", "Fernando");
        Vendedor vendedor = new Vendedor("Rogerio", 32, "Masculino", 200.00, "3213", 10, 10);



        System.out.println(pessoa);
        System.out.println(cliente);
        System.out.println(empregado);
        System.out.println(gerente);
        System.out.println(vendedor);


    }









    
}
