package students.tms;

public class CosmonavtovMain {
    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        if (a > 0) {
            System.out.println("Число А положительное.");
        } else if (a < 0) {
            System.out.println("Число А отрицательное.");
        } else {
            System.out.println("Вы ввели 0.");
        }
        int copyOfDefault = a;
        int b = (a == 0) ? 1 : 0;
        while (a != 0) {
            b++;
            a /= 10;
        }

        System.out.println(copyOfDefault + " has " + b + " characters");
        switch (b) {
            case 1:
                System.out.println("В числе 1 знак.");
                break;
            case 2:
                System.out.println("В числе 2 знака.");
                break;
            case 3:
                System.out.println("В числе 3 знака.");
                break;
            default:
                System.out.println("В числе 4 и более знаков.");
        }

    }
}
