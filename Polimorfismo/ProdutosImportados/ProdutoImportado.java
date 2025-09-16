package Polimorfismo.ProdutosImportados;

public class ProdutoImportado extends Produto{

    private Double taxaImportacao;
    


    ProdutoImportado (){

    }


    public ProdutoImportado(String nome, String estado, Double preco, Double taxaImportacao) {
        super(nome, estado, preco);
        this.taxaImportacao = taxaImportacao;
    }


    public Double gettaxaImportacao() {
        return taxaImportacao;
    }


    public void settaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public Double valorFinal (){
        return getPreco() + gettaxaImportacao();
    }

    @Override
    public String etiquetaPreco() {
        return "Nome: " + getNome() 
        + "Estado: " + getEstado() 
        +  "Valor: " + getPreco()
        + "Valor taxa: " 
        + gettaxaImportacao() 
        + "Preço Final: " 
         + valorFinal();
    }

    
    
}
