package bitwise;

public class BitwiseMain {
    public static void main(String[] args) {
        System.out.println("binary 6 =" + Integer.toBinaryString(6));
        String binaryNegative = Integer.toBinaryString(-6);
        System.out.println("binary -6 =" + binaryNegative + "\t symbol_quantity=" + binaryNegative.length());

        System.out.println("binary 5 =" + Integer.toBinaryString(5));
        System.out.println("binary -5 =" + Integer.toBinaryString(-5));

        System.out.println("decimal=" + Long.parseLong("-100", 2));
        System.out.println("decimal=" + Integer.toHexString(0b0101));

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println("");
        }
    }
}
