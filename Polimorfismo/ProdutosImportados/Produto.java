package Polimorfismo.ProdutosImportados;

public class Produto {

    private String nome;
    private Double preco;
    private String estado;

    public Produto (){

    }

    public Produto (String nome, String estado, Double preco){
        this.nome = nome;
        this.estado = estado;
        this.preco = preco;
        
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String etiquetaPreco (){
        return "Nome: " + getNome() + "Estado: " + getEstado() + "Preço: " + getPreco();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
