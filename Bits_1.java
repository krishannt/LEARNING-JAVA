public class Bits_1 {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int nweNumber = bitMask | n;
        System.out.println(nweNumber);
    } 
}
