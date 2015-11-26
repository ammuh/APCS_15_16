/**
 *
 * @author Ammar Husain
 * Period 4
 *
 */
public class FunLoops {
     /**
     * Method to find the first n magic squares
     * @param n - number of magic squares to find
     */

    public static void magicSquares(int n)
    {
        int sq  = 1;
        int num = 1;
        boolean  searchDone = false;
        for(int i = 1; i <= n; i++, System.out.print(" ")){
            while(!searchDone){
                if(sq*sq < (num + num*num)/2){
                    sq++;
                }else if(sq*sq == (num + num*num)/2){
                    System.out.print(sq*sq);
                    searchDone = true;
                    sq++;
                }else{
                    num++;
                }
            }
            searchDone = false;
        }
    }

}