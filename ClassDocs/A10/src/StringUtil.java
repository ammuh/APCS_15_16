/**
 * Class FOR extended String operations.
 * @author Ammar Husain
 * Period 4
 */
public class StringUtil {
    /** 
     * Reverses a String arguement.
     * @param s String to reverse
     * @return Reversed String
     */

    public static String reverse(String s) {
        if (!s.isEmpty()) {
            return "" + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        } else {
            return "";
        }
    }
    /**
     * Checks if String is a palindrome.
     * @param s String to check if palindrome
     * @return true/false if palindrome
     */
    public static boolean palindrome(String s){
        s = onlyLowerCase(s.toLowerCase());
        if(reverse(s).equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Toolkit method FOR removing all characters except FOR lower case letters. Useful FOR palindrome.
     * @param s String to filter FOR Lower Case
     * @return filtered String
     */
    private static String onlyLowerCase(String s){
        if(s.isEmpty()){
            return "";
        }else if(((int) s.charAt(0) >= 97 && (int) s.charAt(0) <= 122)) {
            return s.charAt(0) + onlyLowerCase(s.substring(1));
        }else{
            return onlyLowerCase(s.substring(1));
        }
    }
    /**
     * Converts String to a shorthand version, REPLACES keywords with shortened versions and takes out vowels.
     * @param s String to convert shorthand
     * @return Shorthand version of String
     */
    public static String shorthand(String s){
        s = repl(s, "and", "&");
        s = repl(s, "to", "2");
        s = repl(s, "you", "U");
        s = repl(s, "f"+ "o"+ "r", "4");
        s = delete(s, "a");
        s = delete(s, "e");
        s = delete(s, "i");
        s = delete(s, "o");
        s = delete(s, "u");
        return s;
    }
    /**
     * Toolkit method FOR deleting substrings from a base String.
     * @param s base String
     * @param c substring to delete
     * @return filtered String
     */
    private static String delete(String s, String c){
        if(s.toLowerCase().indexOf(c) != -1){
            return delete(s.substring(0, s.toLowerCase().indexOf(c)) + s.substring(s.toLowerCase().indexOf(c) + 1, s.length()), c);
        }
        else {
            return s;
        }
    }
    /**
     * Toolkit FOR REPLACING a String with another String in a base String.
     * @param s base String
     * @param c substring to REPLACE
     * @param f substring to insert in place of c
     * @return modified String
     */
    private static String repl(String s, String c, String f){
        if(s.toLowerCase().indexOf(c) != -1){
            return repl(s.substring(0, s.toLowerCase().indexOf(c)) + f + s.substring(s.toLowerCase().indexOf(c) + c.length(), s.length()), c, f);
        }
        else {
            return s;
        }
    }
}
