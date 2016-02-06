import java.util.Arrays;

/**
 * Determines the primes less than or equal to n using the 
 * Sieve of Eratosthenes
 * @author Your name
 * period  ##
 *
 */
public class Eratosthenes {
    private int[] nums;

    public static void main(String[] args) {
        Eratosthenes e = new Eratosthenes(10);
        System.out.println(e);
    }

    /**
     * Constructor to initialize array of primes using the Sieve of Eratosthenes
     * @param n - all primes are less than or equal to n
     */
    public Eratosthenes (int n)
    {
        nums= new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = i+1;
        }

    }
    /** Count the number of primes
     *
     * @return number of primes less than or equal to n
     */
    public int countPrimes()
    {
        return 0;
    }
    /**
     * returns a list of primes less than or equal to n
     * @return
     */
    public int[] listOfPrimes()
    {
        return nums;
    }
    /**
     * Returns a string containing the prime numbers and the number of prime numbers
     * in the list
     */
    public String toString()
    {
        return Arrays.toString(nums);
    }

    private void remove(int pos){
        for(int i = pos; i < nums.length -1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] =0;
    }
}
