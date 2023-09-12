public class tower_of_hanoi_01 {

    public static void tower(String str, int idx) {
    if(idx == 0){
        System.out.println(str.charAt(idx));
        return; 

    }
    System.out.print(str.charAt(idx));
    tower(str, idx-1);
    }

     
    public static void main(String[] args) {
    String str = "abcd";
    tower(str, str.length()-1);
}
    }
