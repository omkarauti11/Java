public class _24_StringBufferAndStringBuffer {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer temp = new StringBuffer();
        System.out.println(temp.capacity());

        StringBuffer stringBuffer1 = new StringBuffer("Navin");
        System.out.println(stringBuffer1.hashCode());

        StringBuffer stringBuffer2 = new StringBuffer("Navin");
        System.out.println(stringBuffer2.hashCode());


        // Mutable
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Initial hashcode of stringBuffer: " + stringBuffer.hashCode());
        
        stringBuffer.append(" Reddy");
        System.out.println("After concatenation hashcode of stringBuffer1: " + stringBuffer.hashCode());



        // Using StringBuilder
        StringBuilder temp1 = new StringBuilder();
        System.out.println(temp1.capacity());

        StringBuilder StringBuilder1 = new StringBuilder("Navin");
        System.out.println(StringBuilder1.hashCode());

        StringBuilder StringBuilder2 = new StringBuilder("Navin");
        System.out.println(StringBuilder2.hashCode());


        // Mutable
        StringBuilder StringBuilder = new StringBuilder("Hello");
        System.out.println("Initial hashcode of StringBuilder: " + StringBuilder.hashCode());
        
        StringBuilder.append(" Reddy");
        System.out.println("After concatenation hashcode of StringBuilder1: " + StringBuilder.hashCode());
        
    }
}
