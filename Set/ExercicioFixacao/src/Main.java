import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Student> set = new HashSet<>();


        System.out.println("How many student for Curse A: ");
        int quantityA = scanner.nextInt();

        for (int i = 0; i<quantityA;i++){
            int studentA = scanner.nextInt();
            set.add(new Student(studentA));
        }

        System.out.println("How many student for Curse B: ");
        int quantityB = scanner.nextInt();

        for (int i = 0; i<quantityB;i++){
            int studentB = scanner.nextInt();
            set.add(new Student(studentB));
        }

        System.out.println("How many student for Curse C: ");
        int quantityC = scanner.nextInt();

        for (int i = 0; i<quantityC;i++){
            int studentC = scanner.nextInt();
            set.add(new Student(studentC));
        }

        System.out.println("Total Students: " + set.size());

    }
}