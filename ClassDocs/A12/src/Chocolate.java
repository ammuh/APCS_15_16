/**
 *
 * @author Ammar Husain
 * Period  4
 *
 */
public class Chocolate {
    /**
     * Checks if we can make chocolate bars
     * @param big - number of big bricks
     * @param small - number of small bricks
     * @param goal - length of chocolate bar
     * @return - true if we have enough bricks to make a chocolate bar, false otherwise
     */
    public boolean canMakeBricks(int small, int big, int goal)
    {
        if(small + 5*big >= goal) {
            if(goal - big*5 < 0){
                big -=(((big*5 - goal)/(big*5))+1);
                return canMakeBricks(small, big, goal);
            }
            else{
                return true;
            }
        }
        return false;
    }
    /**
     * Determines number of small bricks needed to make the chocolate bar
     * @param big - number of big bricks
     * @param small - number of small bricks
     * @param goal - length of chocolate bar
     * @return number of small bricks needed
     */

    public int numberOfSmallBricksNeeded(int small, int big, int goal)
    {
        if(big*5 + small < goal){
            return -1;
        }
        if(big*5 + small == goal){
            return small;
        }
        if(goal - big*5 == 0){
            return 0;
        }
        if(goal - big*5 >= 0){
            if(goal - big*5 > small){
                return -1;
            }
            return goal - big*5;
        }
        else {
           big -=(((big*5 - goal)/(big*5))+1);
            return numberOfSmallBricksNeeded(small, big, goal);
        }
    }

}
