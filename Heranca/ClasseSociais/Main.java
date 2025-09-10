package Heranca.ClasseSociais;

public class Main {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Victor", 21);
        

        Miseravel miseravel = new Miseravel("Fernando", 21);
        miseravel.mendiga();

        Pobre pobre = new Pobre("Jose", 33);
        pobre.trabalha();


        System.out.println(pessoa);
        System.out.println(miseravel);
        System.out.println(pobre);







    }
    
}
