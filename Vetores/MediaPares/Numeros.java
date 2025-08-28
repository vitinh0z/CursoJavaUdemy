package Vetores.MediaPares;

public class Numeros {

    private int numeros;


    public Numeros (int numeros){
        this.numeros = numeros;
    }

    public void setNumeros (int numeros){
        this.numeros = numeros;
    }

    public int getNumeros (){
        return numeros;
    }

    public boolean isPar () {
        if (getNumeros() % 2 == 0){
            return true;
        }
        
        else{
            return false;
        }
    }

    public boolean isImpar () {
        if (getNumeros() != 0){
            return true;
        }
        else {
            return false;
        }
    }






    
}
