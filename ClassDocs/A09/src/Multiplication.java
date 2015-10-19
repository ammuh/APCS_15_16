/**
 *
 * @author Amamr Husain
 * Period 4
 *
 */
/** Allows you to do multiplication calculations with two numbers.
 */
public class Multiplication {
    /**
     * Multiplies two numbers recursively.
     * @param n1 First number
     * @param n2 Second number
     * @return Product of number 1 and 2
     */
    public static int mult(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        if (n1 < 0 && n2 < 0) {
            return mult(-n1, -n2);
        } else if (n1 < 0 || n2 < 0) {
            return -mult(Math.abs(n1), Math.abs(n2));
        } else {
            if (n1 == 1) {
                return n2;
            } else {
                return n2 + mult(n1 - 1, n2);
            }
        }
    }
}