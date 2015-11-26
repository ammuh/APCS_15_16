/**
 * @author Ammar Husain
 * Period 4
 *
 */
public class Pyramid {
    /**
     * Method to make a pyramid
     * @param n - height of the pyramid
     */
    public static void pyramid(int n)
    {
        for(int i =1; i <= n; i++, System.out.println()){
            for(int a = 1; a <= (n-i); a++){
                System.out.print(" ");
            }
            for(int b = 1; b <= 2*i -1; b++){
                System.out.print("*");
            }
        }

    }
}
