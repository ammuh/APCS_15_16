import java.util.*;
//javac SeaCreature.java && javac Fish.java && Octopus.java && Dolphin.java && javac SeaCreature.java && java SeaCreatureDriver
public class SeaCreatureDriver{
    public static void main(String args[]){
        ArrayList<SeaCreature> creature = new ArrayList<SeaCreature>();
        creature.add(new Fish("Wanda"));
        creature.add(new Octopus("Squiddly"));
        creature.add(new Dolphin("Flipper"));
        for(SeaCreature creat : creature){
            creat.swim();
            creat.breed();
            creat.die();
        }
    }
}