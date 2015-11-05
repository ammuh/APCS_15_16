public class Negation{

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