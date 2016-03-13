import java.util.*;

public class Number{
    private int base;
    private int[] num = new int[16];
    private final char[] charSet = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    private char[] digits;
    
    public Number(){
        base = 10;
        digits = Arrays.copyOfRange(charSet, 0, 10);
        System.out.println(Arrays.toString(digits));
        //Assumes "16 bit" number if each bit responds to a digit
        
    }
    public Number(int b, int n){
        base = b;
        digits = Arrays.copyOfRange(charSet, 0, base);
        String s = "";
        while(n/base > 0){
            s = digits[n%base] + s;
            n = n/base;
        }
        s = n + s;
        int pos = 15;
        for(int i = s.length()-1; i >= 0; i--){
            num[pos] = Arrays.asList(digits).indexOf('1');
            pos--;
        }
        System.out.println(s);
        System.out.println(Arrays.toString(num));
        //num = n;
    }
    public void increment(){
        /*
        if(num[15] > base){
            int a = 15;
            num[15] = 0;
            while(a-1 >= 0 && num.get(a-1) == base) {
                num.set(a-1, 0);
                a--;
            }
            if (a > 0) {
                num.set(a-1, num.get(a-1) + 1);
            }
        } else {
            num.set(num.length - 1, num.[num.length-1] + 1);
        }*/
    }
    public String toString(){
        String s = "";
        for(int i = 0; i <  num.length; i++){
            s += num[i];
        }
        return s;
    }
}