package GeradorDeSenha;

import java.util.ArrayList;
import java.util.List;

public class GerarSenha {

    private int tamanho;
    private boolean incluir_simbolos;
    private boolean incluir_numeros;
    private boolean incluir_maiusculas;
    private boolean incluir_minusculas;

    public GerarSenha (){
    }

    public GerarSenha (int tamanho, boolean incluir_simbolos, boolean incluir_numeros, boolean incluir_maiusculas, boolean incluir_minusculas){

        this.tamanho = tamanho;
        this.incluir_maiusculas = incluir_maiusculas;
        this.incluir_numeros = incluir_numeros;
        this.incluir_simbolos = incluir_simbolos;
        this.incluir_minusculas = incluir_minusculas;

        
    } //------> aqui cria construtor passando os atributos do gerarSenha;

    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isIncluir_simbolos() {
        return incluir_simbolos;
    }

    public void setIncluir_simbolos(boolean incluir_simbolos) {
        this.incluir_simbolos = incluir_simbolos;
    }

    public boolean isIncluir_numeros() {
        return incluir_numeros;
    }

    public void setIncluir_numeros(boolean incluir_numeros) {
        this.incluir_numeros = incluir_numeros;
    }

    public boolean isIncluir_maiusculas() {

        return incluir_maiusculas;
    }

    public void setIncluir_maiusculas(boolean incluir_maiusculas) {
        this.incluir_maiusculas = incluir_maiusculas;
    } 
    
    
    public boolean isIncluir_minusculas() {
        return incluir_minusculas;
    }

    public void setIncluir_minusculas(boolean incluir_minusculas) {
        this.incluir_minusculas = incluir_minusculas;
    }

    // ------------ GERAR AS LETRAR MINUSCULAS, MAIUSCULAS, SIMBOLOS, NUMEROS ----------- 

    public String gerarMinuscula (){
        List<Character> letrarMinusculas = new ArrayList<>();

        for (char letra = 'a'; letra <= 'z'; letra++){
            letrarMinusculas.add(letra);
        }

        return gerarMinuscula();
    }

    public String gerarMaiuscula (){

        List<Character> letrarMaiuscula = new ArrayList<>();

        for (char letra = 'A'; letra <= 'Z'; letra++){
            letrarMaiuscula.add(letra);
        }

        return gerarMaiuscula();
    }

    public String gerarNumeros (){
        List<Integer> numeros = new ArrayList<>();

        for (Integer n = 1; n <= 10; n++){
            numeros.add(n);
        }

        return gerarNumeros();
    }

    // ------ PASSA OS METODOS E RETORNA NO METODO GERASENHA
    public String gerarSenha () {

        if (isIncluir_minusculas()){
            gerarMinuscula();
        }

        else if (isIncluir_maiusculas()){
            gerarMaiuscula();
        }

        else if (incluir_numeros){
            gerarNumeros();
        }

        return gerarSenha();

    }



    // TOSTRING 
    @Override
    public String toString() {
        return gerarSenha();
    }

   

    
    
}
