public class Aluno {
    
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;



    public void setNome (String nome){
        this.nome = nome;
    }

    public void setNota1 (float nota1){
        this.nota1 = nota1;
    }

    public void setNota2 (float nota2){
        this.nota2 = nota2;
    }

    
    public void setNota3 (float nota3){
        this.nota3 = nota3;
    }


    public float calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;

    }

    public String situacao (){
        return (calcularMedia() > 6) ? "Aprovado" : "Reprovado";



    }


    public String toString () {
        return "A nota de " + nome + " foi: " + calcularMedia() + " Aluno foi: " + situacao();



    }

}
