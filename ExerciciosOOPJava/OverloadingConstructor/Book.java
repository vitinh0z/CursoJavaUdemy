package OverloadingConstructor;

public class Book {

    private String titulo;
    private String autor;
    private double preco;

    public Book() { // ----> construtor padrao
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.preco = 0.0;
    }


    


    public Book(String titulo, String autor) { // ----> e ele com 
        this.titulo = titulo;
        this.autor = autor;
        this.preco = 0.0;
  
    }

    public Book (String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;

    }

    public Book (double preco){
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String toString (){
        return "Autor: " + getAutor() + "| Livro: " + getTitulo() + "| Preço: " + getPreco();
    }
    



    











    
}
