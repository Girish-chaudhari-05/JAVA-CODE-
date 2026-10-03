//Access Modifier using class and object 
class AccessMod {
    public String name = "Girish";
    private int age = 20;
    String surname = "Chaudhari";   
    protected int pass = 123;

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String args[]) {

        AccessMod a = new AccessMod();

        System.out.println(a.name);
        System.out.println(a.getAge());
        System.out.println(a.pass);
        System.out.println(a.surname);
    }
}