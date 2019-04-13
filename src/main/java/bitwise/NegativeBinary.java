package bitwise;

public class NegativeBinary {
    public static void main(String[] args) {
        String negativeBinary = Integer.toBinaryString(-1);
        System.out.println("negative binary=" + negativeBinary + " with length=" + negativeBinary.length());

        long longNegativeDecimal = Long.parseLong(negativeBinary, 2);
        int intNegativeDecimal = (int) longNegativeDecimal;
        System.out.println("negative decimal=" + intNegativeDecimal);

        long positiveDecimal = Long.parseLong("1", 2);
        System.out.println("positive decimal=" + positiveDecimal);



        int x = 6;
        int y = 5;

        x = x ^ y;
        System.out.println("temp x=" + x);
        y = y ^ x;
        x = x ^ y;

        System.out.println("x=" + x);
        System.out.println("y=" + y);


        int z = 6;
        System.out.println("binary value = " + Integer.toBinaryString(6));
        z = ~z;
        System.out.println("z=" + z);
    }
}
