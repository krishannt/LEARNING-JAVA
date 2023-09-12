public class subsequences {
    public static void sub(String str , int idx, String newString )  {
       
       if(idx == str.length())
       {
        System.out.println(newString);
        return;
       }
        char currChar = str.charAt(idx);
        

        sub(str, idx +1, newString+currChar);

        sub(str, idx+1, newString);
    }
 public static void main(String[] args) {
    String  str = "cnjn";
    sub(str, 0, "");
    
 }   
}
