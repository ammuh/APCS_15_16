import java.util.*;
public class RecursionHelper{
    public static Map<String,String> dataTable = new HashMap<String,String>(200);
    public static void main(String args[]){
       System.out.println(RecursionHelper.weirder(3,2));
        System.out.println(dataTable.toString());
    }
    public static int identity(int num) {
     if(num < 1){
         dataTable.put(("" + num), (""+ 10));
        return 10;
     }
     else{
         dataTable.put(("" + num), (""+ (num + RecursionHelper.identity(num - 2))));
        return num + RecursionHelper.identity(num - 2);
     }
    }
    public static int negative(int num) {
    	if (num >= 20) {
    	    dataTable.put(("" + num), (""+ -5));
    		return -5;
    	} else {
    	    dataTable.put(("" + num), (""+ (negative(num + 4) + 2 * num)));
    		return negative(num + 4) + 2 * num;
    	}
    }
    public static int product(int num) {
    	if (num > 20) {
    	    dataTable.put(("" + num), (""+ -1));
    		return -1;
    	} else {
    	    dataTable.put(("" + num), (""+ (num * product(-2 * num))));
    		return num * product(-2 * num);
    	}
    }
    public static int mist(int n) {
    	if (n == 1) {
    	    dataTable.put(("" + n), (""+ 3));
    		return 3;
    	} else {
    	    dataTable.put(("" + n), (""+ (3 * mist(n - 1))));
    		return 3 * mist(n - 1);
    	}
    }
    public static void misty(int n) {
    	if (n > 4) {
    	    dataTable.put(("" + n), (""+ n%4));
    	    misty(n % 4);
    	}
    	System.out.print(n / 4 + " ");
    }
    public static int mistier(int n) {
    	if (n == 0) {
    	    dataTable.put(("" + n), (""+ 1));
    		return 1;
    	} else {
    	    dataTable.put(("" + n), (""+ (4 * mistier(n - 1) + 2)));
    		return (4 * mistier(n - 1) + 2);
        }   
    }
    public static int mistiest(int n) {
    	if (n == 6){ 
    	    dataTable.put(("" + n), (""+ 6));
    	    return 6;}
    	else {
    	    dataTable.put(("" + n), (""+ (2 * mistiest(n + 1))));
    	    return (2 * mistiest(n + 1));}
    }
    public static int whoKnows(int n) {
    	if (n <= 1) {
    	    dataTable.put(("" + n), (""+ n));
    	    return n;}
    	else {
    	    dataTable.put(("" + n), (""+ (n + whoKnows(n - 1))));
    	    return (n + whoKnows(n - 1));}
    }
    public static int weird(int p, int q) {
    	if (p == 1) {
    	    dataTable.put(("" + p + ":" + q), (""+ (p + 1)));
    		return p + 1;
    	} else if (q == 0) {
    	    dataTable.put(("" + p + ":" + q), (""+ weird(p - 1, q)));
    		return weird(p - 1, q);
    	} else {
    	    dataTable.put(("" + p + ":" + q), (""+ (weird(p - 1, weird(p, q - 1)))));
    		return (weird(p - 1, weird(p, q - 1)));
    	}
    }
    public static int weirder(int r, int s) {
    	if (r == 0 || r == s) {
    	    dataTable.put(("" + r + ":" + s), (""+ 1));
    		return 1;
    	} else {
    	    dataTable.put(("" + r + ":" + s), (""+ (weirder(r - 1, s) + weirder(r - 1, s - 1))));
    		return (weirder(r - 1, s) + weirder(r - 1, s - 1));
    	}
    }
}