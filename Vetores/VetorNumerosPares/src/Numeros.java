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

    public boolean isImpar(){
        if ((getNumeros() / 3) == 0 && (getNumeros() / 5 == 0)){
            
            return true;
        }

        else if ((getNumeros() / 2) == 0 && (getNumeros() / 4 == 0)){

            return false;
        }
        
       
        
    
    }


    

    
    
}
