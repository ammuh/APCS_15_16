public class StringUtil{
    public static void main(String args[]){
        System.out.print(reverse("Car"));
    }
    public static String reverse(String s){
        if(!s.isEmpty()){
            return "" + s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
        }
        else{
            return "";
        }
    }
    public static boolean palindrome(String s){
        return s.reverse().equals(s);
    }
}
/*
. Create a recursive static method reverse that receives a String and returns a String that is
the exact reversal of the characters in the first String. The output should be in the following
format:
Reverse of <original string> is <reversed string>.
Any repetition must be done using recursion (do not use loops). Use only the methods
taught.
2. Create a static method palindrome that receives a String and returns a boolean value of true
if the String is a Palindrome and false if it is not. A word is a palindrome if it reads the
same forwards and backwards. For example, the word level is a palindrome.
Here are two familiar examples:
a. Madam, I'm Adam
b. A man, a plan, a canal: Panama
c. radar
d. Lewd did I live, & evil I did dwel.
Any repetition must be done using recursion (do not use loops). Use only the methods
taught.
3. Create a static method shorthand that receives a String and returns the String converted
into shorthand. Do not use the replace method to do this. The simplified shorthand
form of a string is defined as follows (Note that these actions are done in sequence):
a. Replace these four words: “AND” with “&”, “TO” with “2”, “YOU” with “U”, and
“FOR” with “4”. The four words can be in mixed case (upper or lower or mixed).
b. Remove all vowels (‘a’, ‘e’, ‘i', ‘o’, ‘u’, whether lowercase or uppercase).
Any repetition must be done using recursion (do not use loops). Use only the methods
taught. The string may be given to you in any case (lower or upper) or mixed case.
*/