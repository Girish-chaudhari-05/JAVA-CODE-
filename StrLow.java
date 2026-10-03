//26. Check whether a string contains only lowercase letters.
class StrLow {
    public static void main(String[] args) {
        String str = "java";

        if(str.matches("[a-z]+"))
            System.out.println("Only Lowercase");
        else
            System.out.println("Not Only Lowercase");
    }
}