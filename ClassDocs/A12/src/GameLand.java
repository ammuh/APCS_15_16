import java.util.*;
/**
 *
 * @author Your name
 * Period #
 */

public class GameLand {
    //Declare Random object here
    private Random r;
    private int p1;
    private int p2;
    private int d1;
    private int d2;
    //Declare other instance variables here

    /**
     * Method to create a new Random object and
     * initialize with the give seed
     * @param seed - seed for the random number generator
     */
    public GameLand(int seed)
    {
        //Your code goes here
        r = new Random(seed);
    }
    /**
     * Method that simulates the roll of two dice
     */
    public void roll()
    {
        //Your code goes here
        d1 = r.nextInt(6) + 1;
        d2 = r.nextInt(6) + 1;
    }

    /** Method that runs the game. For each move
     *  print the roll and the players location after the move
     *
     */
    public void moving()
    {
        //Your code goes here
        int turn = 1;
        while(p1 < 100 && p2 < 100){
            roll();
            int di = (d1 + d2);
            switch(turn){
                case 1:
                    System.out.print("Player A rolled a " + di + " >>> ");
                    if(di == 7){
                        p1 -= 7;
                        if(p1< 0){p1 = 0;}
                        System.out.println("******* Player A is now at " + p1);
                    }else if(di == 2 || di == 12){
                        System.out.println("** Player A is now at " + p1);
                    }else if(di + p1 >= 100){
                        p1 += di;
                        System.out.println("Player A WINS!!!");
                    }else{
                        p1 += di;
                        if(p1 == p2){
                            p2 = 0;
                            System.out.println("- BUMPED - Player A is now at " + p1);

                        }
                        else{
                            System.out.println("Player A is now at " + p1);
                        }
                    }
                    turn = 2;
                    break;
                case 2:
                    System.out.print("Player B rolled a " + di + " >>> ");
                    if(di == 7){
                        p2 -= 7;
                        if(p2< 0){p2 = 0;}
                        System.out.println("******* Player B is now at " + p2);
                    }else if(di == 2 || di == 12){
                        System.out.println("** Player B is now at " + p2);
                    }else if(di + p2 >= 100){
                        p2 += di;
                        System.out.println("Player B WINS!!");
                    }else{
                        p2 += di;
                        if(p1 == p2){
                            p1 = 0;
                            System.out.println("- BUMPED - Player B is now at " + p2);
                        }
                        else{
                            System.out.println("Player B is now at " + p2);
                        }
                    }
                    turn = 1;
                    break;
            }
        }
        System.out.println("Player A is now at " + p1 + "\nPlayer B is now at " + p2);
    }


}