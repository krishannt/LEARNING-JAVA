public class String8 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0,'k');

        // System.out.println(sb);
        // sb.insert(0,'l');

        // System.out.println(sb);
        // sb.delete(2, 3);
        // System.out.println(sb);
        //  sb.append("hello");
        //  System.out.println(sb);
        //  for (int i = sb.length(); i>=0; i--){
                
        //    System.out.println(sb);

        //  }
         for (int i = 0; i<sb.length()/2; i++){
                
           int front = i;
           int back = sb.length() - 1 - i;

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
         
        sb.setCharAt(front, backChar);
        sb.setCharAt( backChar, frontChar);
         }
         System.out.println(sb);
    }

}
