public class backtracking_01 {

public static void printpar(String str, String perm , int idx) {
    
    if(str.length() == 0){
        System.out.println(perm);
        return;
    }
    for(int i =0; i<str.length();i++){
    char currChar = str.charAt(i);
    String newstr = str.substring(0,1)+str.substring( i+1);
     printpar(newstr, perm+currChar, idx+1);
     }
}
    public static void main(String[] args) {
        String str = "ABC";
        printpar(str, "", 0);
    }
}
 