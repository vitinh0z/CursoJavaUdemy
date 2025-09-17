package Cripotografi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        
        String msg = "Hello World";

        md.update(msg.getBytes());

        byte[] digest = md.digest();

        System.out.println(digest);

        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i<digest.length;i++){
            hexString.append(Integer.toHexString(0xff & digest[i]));
        }

        System.out.println("HEX: " + hexString.toString());




    }
    
}
