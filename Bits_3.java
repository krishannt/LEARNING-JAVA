import java.util.*;
public class Bits_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int op = sc.nextInt();
       int n = 5;
       int pos = 1;
      
        int bitMask = 1<<pos;
        if(op==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask;
            System.out.println(newNumber); 
        
        }
        sc.close();
    }
}
