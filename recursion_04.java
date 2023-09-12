public class recursion_04 {

    
   public static int printpower( int x, int n ) {
 if(n==0){
    return 1;
 }
 if(n==0){
    return 0;
 }

if(n%2==0){

    return printpower(x, n/2) * printpower(x, n/2);
}

else{
    return printpower(x, n/2) * printpower(x, n/2)*x;

}

}


    public static void main(String[] args) {
      int n = 5;
      int x=3;
      int  ans = printpower(x,n);
      System.out.println(ans);
    }
    
   
}