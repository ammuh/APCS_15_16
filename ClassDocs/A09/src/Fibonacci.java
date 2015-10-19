/**
 * @author Ammar Husain
 * Period 4
 */
/** Allows you to do math with fibonacci sequences.
 */
public class Fibonacci {
    /**
     * Finds fibonacci number at a given position.
     * @param n Position of fib sequence.
     * @return Fib number
     */
    public int fib(int n)
    {
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }//end method

}//end class