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
        if(s.toLowerCase().indexOf("and") != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf("and")) + "&" + s.substring(s.toLowerCase().indexOf("and") +3, s.length()));
        } else if(s.toLowerCase().indexOf("to") != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf("to")) + "2" + s.substring(s.toLowerCase().indexOf("to") +2, s.length()));
        } else if(s.toLowerCase().indexOf("you") != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf("you")) + "U" + s.substring(s.toLowerCase().indexOf("you") +3, s.length()));
        } else if(s.toLowerCase().indexOf("f" + "o" + "r") != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf("f" + "o" + "r")) + "4" + s.substring(s.toLowerCase().indexOf("f" + "o" + "r") +3, s.length()));
        } else if(s.toLowerCase().indexOf('a') != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf('a')) + s.substring(s.toLowerCase().indexOf('a') +1, s.length()));
        } else if(s.toLowerCase().indexOf('e') != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf('e')) + s.substring(s.toLowerCase().indexOf('e') +1, s.length()));
        } else if(s.toLowerCase().indexOf('i') != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf('i')) + s.substring(s.toLowerCase().indexOf('i') +1, s.length()));
        } else if(s.toLowerCase().indexOf('o') != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf('o')) + s.substring(s.toLowerCase().indexOf('o') +1, s.length()));
        } else if(s.toLowerCase().indexOf('u') != -1){
            return shorthand(s.substring(0, s.toLowerCase().indexOf('u')) + s.substring(s.toLowerCase().indexOf('u') +1, s.length()));
        } else{
            return s;
        }
    }
}
