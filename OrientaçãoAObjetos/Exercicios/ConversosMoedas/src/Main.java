import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner read = new Scanner(System.in);
        Moedas moedas = new Moedas();

        System.out.println("\n-------- 💲 Conversor de Moedas 💲-------- \n");

        System.out.print("Escolha a moeda que gostaria de converter:\n");

        System.out.println(" [1] - Dolar(USD)\n [2] - Euro(EUR)\n [3] - Libra(GBP)\n [4] - Iene Japonês(JPY)\n ");
        
        moedas.setEscolhaMoeda(read.nextInt());

        boolean verificarValor = false;
         do {
            try {
                System.out.print("Digite o valor da moeda:R$ ");
                moedas.setMoeda(read.nextDouble());
                verificarValor = true;
            } 
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        } while (verificarValor == false);

        moedas.Converter();

        read.close();

        System.out.println(moedas);
    }
}
