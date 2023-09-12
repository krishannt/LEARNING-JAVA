public class recursion_06 {
    public static int  tiles(int n, int m) {
     
      if (n==m){

        return 2;
      }
      if(n<m){

        return 1;
      }
        int vertplace = tiles(n - m, m);
        int horplace = tiles(n-1, m);
        return vertplace+horplace;

    }
    public static void main(String[] args) {
       
        int n = 4;
        int m = 2;
        System.out.println(tiles(n, m));

    }
}
