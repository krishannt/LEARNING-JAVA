import java.util.*;
public class Arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int [row][col];

        for(int i=0; i<row;  i++){

            for(int j = 0 ; j<col; j++){

                a[i][j]= sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0; i<row;  i++){

            for(int j = 0 ; j<col; j++){ 
                if(a[i][j]==x){
                    System.out.println("x if found (" + i+ " ,"+ j + ")");
                } 
            }
        }
       sc.close();
    }    
}
