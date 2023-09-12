 import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int a[]=new int[size];


        for(int i=0; i<size; i++){
           a[i]= sc.nextInt();
        }
          int  x = sc.nextInt();

          System.out.println();

          for(int i=0; i<a.length; i++){
           
            if(a[i]== x){

                System.out.println(i);

            }
            

          }
       sc.close();
    }
}
