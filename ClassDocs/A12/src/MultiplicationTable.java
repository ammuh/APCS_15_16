/**
 *
 * @author Your name
 * Period #
 *
 */
public class MultiplicationTable {
    /**
     * Method to print the multiplication
     * table for the given number of rows and columns
     * @param nrows - number of rows
     * @param ncols - number of columns
     */
    public static void printTable(int nrows, int ncols)
    {
        System.out.print("  ");
        for(int a = 1; a <= ncols; a++){
            System.out.printf("%7d", a);
        }
        System.out.println();
        System.out.println();
        for(int b = 1; b <= nrows; b++, System.out.println()){
            System.out.printf("%2d", b);
            for(int c = 1; c <= ncols; c++){
                System.out.printf("%7d", c*b);
            }
        }
    }
}
