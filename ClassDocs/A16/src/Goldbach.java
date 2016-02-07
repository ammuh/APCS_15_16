/**
 * Computes all primes less than N and tries to express N as a sum of two
 * primes. Goldbach's conjecture says that this is always possible if N is even
 * and greater than 2. When N is odd, these are called prime pairs.
 *
 * @author Your name
 *  period ##
 */
public class Goldbach {
    private Eratosthenes e;
    private final int N;

    public static void main(String[] args) {
        Goldbach g  = new Goldbach(22);
        System.out.println(g.sumOfTwoPrimes());
    }
    /**
     * Constructor creates the list of primes using the class Eratosthenes and
     * initializes N to the passed in value of n
     *
     * @param n
     *            - number to be written as a sum of two primes
     */
    public Goldbach(int n) {
       N = n;
        e = new Eratosthenes(n);
    }



    /**
     * Returns a string that includes all the prime pairs that add up to N
     *
     * @return string with the all the prime pairs that add up to N
     */
    public String sumOfTwoPrimes() {
        String s = "" + N;
        int l = s.length();
        for(int a = 0; a < e.listOfPrimes().length; a++){
            if(e.listOfPrimes()[a] != 0) {
                for(int b = 0; b < e.listOfPrimes().length; b++){
                    if(e.listOfPrimes()[b] != 0 && e.listOfPrimes()[a] <= e.listOfPrimes()[b] && e.listOfPrimes()[a] + e.listOfPrimes()[b] == N){
                        s+= " = " + e.listOfPrimes()[a] + " + " + e.listOfPrimes()[b];
                    }
                }
            }
        }
        if(l == s.length()){
            s+= " not expressible as sum of two primes";
        }
        return s;
    }
}
