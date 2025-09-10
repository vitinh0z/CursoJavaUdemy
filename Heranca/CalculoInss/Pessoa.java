package Heranca.CalculoInss;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String sexo;

    public Pessoa () {

    }

    public Pessoa (String nome, Integer idade, String sexo) {
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return " " + getNome() + " " + getIdade() + " " + getSexo() + " ";
    }

    
    
}
