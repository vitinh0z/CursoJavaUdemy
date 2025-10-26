import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,7,3,6));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //Uniao
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //Intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //Diferença
        Set<Integer> e = new TreeSet<>(a);
        e.retainAll(b);
        System.out.println(e);
    }
}