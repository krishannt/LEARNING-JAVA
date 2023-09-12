public class subsequences_01 {
    public static String[] keypad = { ".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void print(String str , int idx, String comString )  {
        if(idx == str.length()){
          System.out.println(comString);
          return;
        }
     char    currChar = str.charAt(idx);
     String mapping  = keypad[currChar - '0'] ;

     for(int i =0; i<mapping.length(); i++ ){
      print(str, idx+1, comString+mapping.charAt(i));

     }
    }   
 public static void main(String[] args) {
   
    String str = "23";
    print(str, 0, "");
 }   
}

