public class Main {

    public static void main(String[] args) {

        System.out.println(palindrome("abcba"));
        System.out.println(palindrome("argentinamanitnegra"));
        System.out.println(palindrome("Sapalsarītadēdatīraslapas"));
        System.out.println(palindrome("abccb"));
        System.out.println(palindrome("stirna"));

    }
    static boolean palindrome(String s) {
        if (s == null || s.length() <= 1){
            return true;
        }
        return Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length()-1)) && palindrome(s.substring(1, s.length()-1));
    }

}
