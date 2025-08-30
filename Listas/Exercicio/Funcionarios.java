package Listas.Exercicio;

public class Funcionarios {

    private String nome;
    private int id;
    private double salario;

    public Funcionarios (){

    }

    public Funcionarios(String nome, int id, double salario) {
        this.nome = nome;
        this.id= id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    



    
}
