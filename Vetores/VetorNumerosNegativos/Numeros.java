package Vetores.VetorNumerosNegativos;

public class Numeros {

    private int numeros;

    public Numeros(int numeros) {

        this.numeros = numeros;
    }

    public int getNumeros() {

        return numeros;
    }

    public void setNumeros(int numeros) {

        this.numeros = numeros;
    }

    public boolean NumeroPositivo () {
 
        return getNumeros() > 0;
    }

    public boolean numeroNegativo (){

        return getNumeros() < 0;
 
    }
    

}
