package students.tms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int x = 6;

        while (++i < --x) {
            System.out.println("i="+i);
            System.out.println("x="+x);
        }

        System.out.println(i);

    }
}
