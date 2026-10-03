//21. Find the largest character in a string.
class LarStr
 {
    public static void main(String[] args) {
        String str = "girish";
        char max = str.charAt(0);

        for(int i=1;i<str.length();i++) {
            if(str.charAt(i) > max)
                max = str.charAt(i);
        }

        System.out.println("Largest Character: " + max);
    }
}