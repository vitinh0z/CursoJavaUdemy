
public class Verificador {

    public static void verificador (Numeros[] vetor){

        
        for (int i = 0; i<vetor.length; i++){

            if (vetor[i].isPar()){
            System.out.println("Par: " + vetor[i].getNumeros());
            }
            else if(vetor[i].isImpar()) {
                System.out.println("Impar: " + vetor[i].getNumeros());
            }
        }
    }
    
}
