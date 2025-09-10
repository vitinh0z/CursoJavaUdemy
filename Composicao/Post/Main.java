package Composicao.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("wow thats awesome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to new Zealand", "iM Going to visit this wonderful country", 12);

        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);





    }
    
}
