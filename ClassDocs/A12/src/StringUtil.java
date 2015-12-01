/**
 *
 * @author Your name
 * Period #
 *
 */
public class StringUtil
{
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
    public static String phraseToPigLatin(String text)
    {
        String textl = text.toLowerCase();
        if(textl.indexOf('a') < 0 && textl.indexOf('e') < 0 && textl.indexOf('i') < 0 && textl.indexOf('o') < 0 && textl.indexOf('u') < 0){}
        return text;
    }

}
