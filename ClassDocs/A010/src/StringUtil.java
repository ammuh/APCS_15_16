public class StringUtil {
    public static void main(String args[]) {
        System.out.print(palindrome("Dammit I’m mad. Evil is a deed as I live. God, am I reviled? I rise, my bed on a sun, I melt. To be not one man emanating is sad. I piss. Alas, it is so late. Who stops to help? Man, it is hot. I’m in it. I tell. I am not a devil. I level “Mad Dog”. Ah, say burning is, as a deified gulp, In my halo of a mired rum tin. I erase many men. Oh, to be man, a sin. Is evil in a clam? In a trap? No. It is open. On it I was stuck. Rats peed on hope. Elsewhere dips a web. Be still if I fill its ebb. Ew, a spider… eh? We sleep. Oh no! Deep, stark cuts saw it in one position. Part animal, can I live? Sin is a name. Both, one… my names are in it. Murder? I’m a fool. A hymn I plug, deified as a sign in ruby ash, A Goddam level I lived at. On mail let it in. I’m it. Oh, sit in ample hot spots. Oh wet! A loss it is alas (sip). I’d assign it a name. Name not one bottle minus an ode by me: “Sir, I deliver. I’m a dog” Evil is a deed as I live. Dammit I’m mad."));
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
        }
        if(s.length() == 1){
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
        } else if(s.toLowerCase().indexOf("for") != -1){
            s = s.substring(0, s.toLowerCase().indexOf("for")) + "4" + s.substring(s.toLowerCase().indexOf("for") +3, s.length());
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
