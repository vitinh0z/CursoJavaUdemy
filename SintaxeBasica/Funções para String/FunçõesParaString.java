public class FunçõesParaString {

    public static void main (String[] args){

        String original = "abcde FGHIJ ABC abc DEFG  ";

        // Exemplos de funções para String
        String minuscula = original.toLowerCase();           // Tudo minúsculo
        String maiuscula = original.toUpperCase();           // Tudo maiúsculo
        String semEspacos = original.trim();                 // Remove espaços nas extremidades
        String sub1 = original.substring(2);                 // Substring a partir do índice 2
        String sub2 = original.substring(2, 9);              // Substring do índice 2 ao 8
        String trocaChar = original.replace('a', 'x');       // Troca 'a' por 'x'
        String trocaTexto = original.replace("abc", "xy");   // Troca "abc" por "xy"
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println("Original:           -" + original + "-\n");

        System.out.println("toLowerCase:        -" + minuscula + "-");
        System.out.println("toUpperCase:        -" + maiuscula + "-");
        System.out.println("trim:               -" + semEspacos + "-");
        System.out.println("substring(2):       -" + sub1 + "-");
        System.out.println("substring(2,9):     -" + sub2 + "-");
        System.out.println("replace('a','x'):   -" + trocaChar + "-");
        System.out.println("replace(\"abc\",\"xy\"): -" + trocaTexto + "-");
        System.out.println("Index of\"bc\":   " + i);
        System.out.println("Index LastIndexOf\"bc\":   " + j);
        
        

    }

}