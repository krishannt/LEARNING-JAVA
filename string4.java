public class string4 {
    public static void main(String[] args) {
        
        String firstname = "krishan";
        String lastname = "saini";
        String fullname = firstname + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for (int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

    }
}
