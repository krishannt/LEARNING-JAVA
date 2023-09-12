class pen{

    String color;
    String type ;
    public void write(){
        System.out.println("writing");

    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Studant {

    String name;
    int age ;

    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class class_01 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "blue ";
        pen1.type = "gel";
        
        pen pen2 = new pen();
        pen1.color = "black";
        pen1.type = "ball";
        
        pen1.printColor();
        pen2.printColor();

        Studant studant1  = new Studant();
        studant1.name = "krishan";
        studant1.age = 22;

        studant1.printInfo();
    }
     
}
