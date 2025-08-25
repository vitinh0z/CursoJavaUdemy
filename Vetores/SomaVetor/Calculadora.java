package Vetores.SomaVetor;

public class Calculadora {


    public static double calcularSoma(Numero[] vetor) {
            
        double soma = 0.0;

        for (int i = 0; i<vetor.length;i++){
            soma += vetor[i].getNumero();
        }
            
        return soma;
   
    }

    public static double calcularMedia (Numero[] vetor){

        return  calcularSoma(vetor) / vetor.length;
    }


    
}
