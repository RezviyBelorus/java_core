import java.io.Console;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int x = 4;

        System.out.println(10*-20/++x);

        x = 4;

        System.out.println(10*-20/x++);


        Console console = System.console();

        System.out.println("Getting data from console");
        String input = console.readLine("Enter ur name: ");

        System.out.println("Ur name: " + input);
    }
}
