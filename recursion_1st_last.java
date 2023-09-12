public class recursion_1st_last {
    public static int first = -1;
    public static int last = -1;
    public static void first_last(String str,int idx,char ele) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char CurrChar = str.charAt(idx);
        if(CurrChar == ele){
           if(first == -1){
            first = idx;

           }else{
            last =idx;
           }
        }
        first_last(str, idx+1, ele);
    }
    
    public static void main(String[] args) {
        String str = "abaaddjifdaj";
        first_last(str, 0, 'a');
    }
}
