package OrientaçãoAObjetos.MetodosEstaticos;

public class CalculoDolar {

    public static final double IOF = 0.06;

    public static double valor (double valorDolar){
        return valorDolar;

    }

  // valor do produto em doolar
     public static double preco (double precoProduto){
        return precoProduto;
        
    }


     public static double valorImposto(double valorDolar, double preco) {
        return (valorDolar * preco) * IOF;
    }

    public static double valorReais(double imposto, double preco, double valorDolar) {
        
        // Converte o preço do produto para reais
        double precoEmReais = preco * valorDolar;
        
        // Soma o preço em reais com o imposto que já estava em reais
        return precoEmReais + imposto;
    }

    




    
}
