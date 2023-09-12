public class permutation {
public static void par(String str, String  str_2 ) {
    if(str.length() ==0 ){
        System.out.println(str_2);
        return;
    }
    for (int i=0;i<str.length(); i++){
        char currchar = str.charAt(i);
        String newString = str.substring(0, i) +str.substring(i+1);
        par(newString, str_2+currchar);
        
    }
}

    public static void main(String[] args) {
        String str = "abc";
        par(str, " ");
        
    }
}
