/**
 * 
 * @author Ammar Husain
 * Period 4
 *
 */
public class StringUtil {
	/** 
	* Converts a string to it piglatin form according to the following rules:
	* a. If there are no vowels in englishWord, then pigLatinWord is just
	* englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
	* and 'u', and their uppercase counterparts.)
	* b. Else, if englishWord begins with a vowel, then pigLatinWord is just
	* englishWord + "yay".
	* c. Otherwise (if englishWord has a vowel in it and yet doesn't start
	* with a vowel), then pigLatinWord is end + start + "ay", where end
	* and start are defined as follows:
	* 1. Let start be all of englishWord up to (but not including) its
	* first vowel.
	* 2. Let end be all of englishWord from its first vowel on.
	* 3. But, if englishWord is capitalized, then capitalize end and
	* "uncapitalize" start.
	*
	* @return piglatin version of text as a String 
	*/

	public static String phraseToPigLatin(String text){
        String newText = "";
        String word = "";
        String nonWord = "";
        for(int i = 0; i < text.length(); i++){
            if(isALetter(text.charAt(i))){
                word += text.charAt(i);
            }else{
                nonWord += text.charAt(i);
            }
            if(!nonWord.equals("") && word.equals("")){
                newText += nonWord;
                nonWord = "";
            }else if(nonWord.equals("") && !word.equals("") && i == text.length()-1){
                newText += wordToPigLatin(word);
                word = "";
            }else if(nonWord.equals("")){

            }else{
                newText += wordToPigLatin(word) + nonWord;
                nonWord = "";
                word = "";
            }
        }
        return newText;
	}
    private static boolean isALetter(char c){
        String s = "" + c;
        c = s.toLowerCase().charAt(0);
        if((int)c < 97 || (int)c > 122 ){
            return false;
        }else{
            return true;
        }
    }
    private static String wordToPigLatin(String text){
        String ltext = text.toLowerCase();
        if((ltext.length() == 1 && (ltext.charAt(0) < 97 || ltext.charAt(0) > 122)) || text.equals("")){
            return text;
        }
        if(ltext.indexOf('a') < 0 && ltext.indexOf('e') < 0 && ltext.indexOf('i') < 0 && ltext.indexOf('o') < 0 && ltext.indexOf('u') < 0){
            return text + "ay";
        }else if(ltext.charAt(0) == 'a' || ltext.charAt(0) == 'e' || ltext.charAt(0) == 'i' || ltext.charAt(0) == 'o' || ltext.charAt(0) == 'u'){
            return text + "yay";
        }else if(ltext.indexOf('a') >= 0 || ltext.indexOf('e') >= 0 || ltext.indexOf('i') >= 0 || ltext.indexOf('o') >= 0 || ltext.indexOf('u') >= 0){
            int pos = -1;
            int i = 0;
            while(pos == -1){
                if(ltext.charAt(i) == 'a' || ltext.charAt(i) == 'e' || ltext.charAt(i) == 'i' || ltext.charAt(i) == 'o' || ltext.charAt(i) == 'u'){
                    pos = i;
                }
                i++;
            }
            if(text.charAt(0) < 97){
                return text.substring(pos, pos+1).toUpperCase()+ text.substring(pos+1)+text.substring(0, pos).toLowerCase() + "ay";
            }
            return text.substring(pos)+text.substring(0, pos) + "ay";
        }
        return "";
    }
	  
}