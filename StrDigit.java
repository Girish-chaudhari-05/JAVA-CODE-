//	Check whether a string contains only digits.
class StrDigit {
    public static void main(String[] args) {
        String str = "12345";

        if(str.matches("[0-9]+"))
            System.out.println("Only Digits");
        else
            System.out.println("Not Only Digits");
    }
}