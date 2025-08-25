
public class Verificador {

    public static void verificador (Numeros[] vetor){

        
        for (int i = 0; i<vetor.length; i++){

            if (vetor[i].getNumeros() % 2 == 0){
            System.out.println("Par: " + vetor[i].getNumeros());
            }

            else {
                System.out.println("Impar: " + vetor[i].getNumeros());
            }
        }
    }
    
}
