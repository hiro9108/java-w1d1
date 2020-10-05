public class MyFirstJavaProgram {
    public static void main(String[] args) {
        byte numByte = 2;
        short numShort = 22;
        int numInt =222;
        long numLong = 222222;

        System.out.println("byte " + numByte);
        System.out.println("short " + numShort);
        System.out.println("int " + numInt);
        System.out.println("long " + numLong);

        // reaasign
        numInt = 999;
        System.out.println("reaasign int " + numInt);
    }
}