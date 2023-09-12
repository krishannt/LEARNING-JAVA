import java.util.*;

public class recursion_08 {
    public static void sub2(ArrayList<Integer> subset )  {
    for(int i =0; i>subset.size(); i++){
        System.out.print(subset.get(i)+ " ");
    }
    System.out.println();
    }
    public static void sub(int n ,ArrayList<Integer> subset )  {
       if(n== 0){
       sub2(subset);
       return;

       }
      subset.add(n);
      sub(n-1, subset);

      subset.remove(subset.size()-1);
      sub(n-1, subset);
    }
      
 public static void main(String[] args) {
    
    int n =3;
    ArrayList<Integer> subset = new ArrayList<>();
    sub(n, subset);
 }   
}
