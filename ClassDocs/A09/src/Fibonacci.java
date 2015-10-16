/**
 * Created by Ammar Husain on 10/15/2015.
 */
public class Fibonacci {
    public  static void main(String args[]){

        System.out.println(mult(0,5));
    }
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }

    }
    public static int mult(int n1, int n2){
        if(n1 == 1) {
            return n2;
        }
        else if(n1 == 0){
            return 0;
        }
        else{
            return n2 + mult(n1 -1, n2);
        }
    }
}
