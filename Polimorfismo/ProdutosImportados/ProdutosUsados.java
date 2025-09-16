package Polimorfismo.ProdutosImportados;

import java.util.Date;

public class ProdutosUsados extends Produto{

    private Date dataFabricacao;

    ProdutosUsados(){
    }

    

    public ProdutosUsados(String nome, String estado, Double preco, Date dataFabricacao) {
        super(nome, estado, preco);
        this.dataFabricacao = dataFabricacao;
        
        
    }


    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaPreco() {
        
        return "Nome: " + getNome() + "Estado: " + getEstado() +  "Valor: " + getPreco() + "data de fabricação: " + getDataFabricacao();
    }

    



}