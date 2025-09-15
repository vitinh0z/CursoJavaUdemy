package Polimorfismo.ProdutosImportados;

public class ProdutoImportado extends Produto{

    private Double taxaImportacao;


    ProdutoImportado (){

    }


    ProdutoImportado(String nome, Double preco, Double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }


    public Double gettaxaImportacao() {
        return taxaImportacao;
    }


    public void settaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String etiquetaPreco() {
        return super.etiquetaPreco();
    }

    
    
}
