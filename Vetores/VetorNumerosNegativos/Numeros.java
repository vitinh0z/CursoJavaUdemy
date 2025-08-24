package Vetores.VetorNumerosNegativos;

public class Numeros {

    private int numeros;

   


    
    public Numeros(int numeros) {
         if (numeros > 10) {
            throw new IllegalArgumentException("Quantidade deve ser menor que 10");
        }

        this.numeros = numeros;
    }
    

    public int getNumeros() {
        
        return numeros;
    }

    public void setNumeros(int numeros) {
        if (numeros <= 0){
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
       
        this.numeros = numeros;
    }

    



    
    
}
