public class recursion_03 {

    
   public static int printpower( int x, int n ) {
 if(n==0){
    return 1;
 }
 if(n==0){
    return 0;
 }

    int xPower1 = printpower(x,n-1);
    int xpower = x*xPower1;
    return xpower;
}


    public static void main(String[] args) {
      int n = 5;
      int x=2;
      int  ans = printpower(x,n);
      System.out.println(ans);
    }
    
   
}