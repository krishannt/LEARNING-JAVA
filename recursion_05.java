public class recursion_05 {
    public static int path( int i,int j,int n, int m) {

        if(i==n || j ==m){
            return 0;
        }
        if(i==n-1 || j ==m-1){
            return 1;
        }
        int downpath  = path(i+1, j, n, m);
        int rightpath  = path(i, j+1, n, m);
        return rightpath+downpath;
        
    }
    public static void main(String[] args) {
        int n =3;
        int m =3;
       int a =  path(0, 0, n, m);
       System.out.println(a);
    }
}
