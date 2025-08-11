package OrientaçãoAObjetos.Exercicios;
public class  MediaNota{

    private float Nota1;
    private float Nota2;
    private float Nota3;



    public void setNota1 (float Nota1){
            this.Nota1 = Nota1;
        
    }


    
    public void setNota2 (float Nota2){
        this.Nota2 = Nota2;
    }

    
    public void setNota3 (float Nota3){
        this.Nota3 = Nota3;
    }


   public float calcularMedia () {
        return (Nota1 + Nota2 + Nota3) / 3;

   }


   public String situacao(){
        return (calcularMedia() > 6) ? "Aprovado" : "Reprovado";


   }



   public String toString () {
    return String.format("A média é %.2f - %s", calcularMedia(), situacao());
   }


}