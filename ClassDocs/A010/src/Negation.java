/**
 * Class FOR Binary Negation.
 * @author Ammar Husain
 * Period 4
 */
public class Negation{
<<<<<<< HEAD

=======
    /**
     * Inverts a binary String
     * @param s binary String
     * @return negated binary String
     */
>>>>>>> 379e4c8cb3df98aa444240eb3102c5f8280dd1d8
    public static String negate(String s){
        if(s.isEmpty()){
            return "";
        }else if(s.length() == 1){
            if(s.charAt(0) == '1'){
                return "0";
            }else if(s.charAt(0) == '0'){
                return "1";
            }else{
                return s;
            }
        }else{
            return negate("" + s.charAt(0)) + negate( s.substring(1, s.length()));
        }
    }
}