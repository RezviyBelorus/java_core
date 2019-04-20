package students.tms;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;
// test comment
public class Main {

    public static void main(String[] args) {

        out.println(1.2 + 1.4);
        out.println(Math.cos(180));

        out.println(Math.log10(100));
    }

    private static int initialize(String[] args) {
        Scanner scanner = new Scanner(args[0]);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            out.print('\n' + args[0] + " - that is not an INTEGER  number! value = '256' \n");
            return 512;
        }
    }

}
