package GeradorDeSenha;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    
    public String obterCaracteresMinusculos (){
        return "abcdefghijklmnopqrstuvwxyz";
    }

    public String obterCaracteresMaiusculos(){
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public String obterNumeros (){
        return "0123456789";
    }

    public String obterCaracteresEspeciais () {
        return "!@#$%¨&*()_+-=;:?{}}|/";
    }


    // ------ PASSA OS METODOS E RETORNA NO METODO GERASENHA
    public String gerarSenha () {
        String caracteresPermitidos = "";

        if (isIncluir_minusculas()){
            caracteresPermitidos += obterCaracteresMinusculos();
        }

        if (isIncluir_maiusculas()){
          caracteresPermitidos += obterCaracteresMaiusculos();
        }

        if (isIncluir_numeros()){
            caracteresPermitidos += obterNumeros();
        }

        if (isIncluir_simbolos()){
            caracteresPermitidos += obterCaracteresEspeciais();
        }

        if (caracteresPermitidos.isEmpty()){
            return "Erro. Escolha ao menos uma opção";
        }

        StringBuilder senhaFinal = new StringBuilder();
        Random random = new SecureRandom();

        for (int i = 0; i<this.tamanho; i++){
            int sorteio = random.nextInt(caracteresPermitidos.length());

            char caracteresSorteado = caracteresPermitidos.charAt(sorteio);

            senhaFinal.append(caracteresSorteado);
        }


        return senhaFinal.toString();

    }

    

   

    
    
}
