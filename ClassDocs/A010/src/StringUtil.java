public class StringUtil {
    public static void main(String args[]) {
        System.out.print(reverse("race car"));
    }

    public static String reverse(String s) {
        if (!s.isEmpty()) {
            return "" + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        } else {
            return "";
        }
    }
    public static boolean palindrome(String s){
        s = s.toLowerCase();
        if(s.length() == 0){
            return true;
        }else if(s.length() == 1){
            return true;
        }
        else {
            char a = s.charAt(0);
            char b = s.charAt(s.length()-1);
            if(((int) a >= 97 && (int) a <= 122) && ((int) b >= 97 && (int) b <= 122)){
                if(a == b) {
                    return palindrome(s.substring(1, s.length() - 1));
                }
                else {
                    return false;
                }
            }
            else {
                if(!((int) a >= 97 && (int) a <= 122)){
                    s = s.substring(1, s.length());
                }
                if(!((int) b >= 97 && (int) b <= 122)){
                    if(s.length()>1){
                        s = s.substring(0, s.length()-1);
                    }
                    else{
                        s = "";
                    }
                }
                return palindrome(s);
            }
        }
    }
    public static String shorthand(String s){
        if(s.toLowerCase().indexOf("and") != -1){
            s = s.substring(0, s.toLowerCase().indexOf("and")) + "&" + s.substring(s.toLowerCase().indexOf("and") +3, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf("to") != -1){
            s = s.substring(0, s.toLowerCase().indexOf("to")) + "2" + s.substring(s.toLowerCase().indexOf("to") +2, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf("you") != -1){
            s = s.substring(0, s.toLowerCase().indexOf("you")) + "U" + s.substring(s.toLowerCase().indexOf("you") +3, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf("f" + "o" + "r") != -1){
            s = s.substring(0, s.toLowerCase().indexOf("f" + "o" + "r")) + "4" + s.substring(s.toLowerCase().indexOf("f" + "o" + "r") +3, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf('a') != -1){
            s = s.substring(0, s.toLowerCase().indexOf('a')) + s.substring(s.toLowerCase().indexOf('a') +1, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf('e') != -1){
            s = s.substring(0, s.toLowerCase().indexOf('e')) + s.substring(s.toLowerCase().indexOf('e') +1, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf('i') != -1){
            s = s.substring(0, s.toLowerCase().indexOf('i')) + s.substring(s.toLowerCase().indexOf('i') +1, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf('o') != -1){
            s = s.substring(0, s.toLowerCase().indexOf('o')) + s.substring(s.toLowerCase().indexOf('o') +1, s.length());
            return shorthand(s);
        } else if(s.toLowerCase().indexOf('u') != -1){
            s = s.substring(0, s.toLowerCase().indexOf('u')) + s.substring(s.toLowerCase().indexOf('u') +1, s.length());
            return shorthand(s);
        } else{
            return s;
        }
    }
}
