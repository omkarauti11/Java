public class _06_TypeConversionAndCasting {
    public static void main(String[] args) {

        // Type Conversion
        byte b = 127;
        int a = b;
        System.out.println(b);
        System.out.println(a);


        // Type Casting
        int aa = 57;
        byte k = (byte) aa;
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        int a2 = 129;
        // last 8 bit --> if MSB (Most Significant bit ) is 1 --> negative number--> calculate 2's complement (invert all bits and add 1 to LSB-->least significant bit)
        byte b2 = (byte) a2;
        System.out.println(b2);


        // Type Promotion
        byte a1 = 10;
        byte b1= 20;

        int result = a1 * b1;
        System.out.println(result);

    }
}
