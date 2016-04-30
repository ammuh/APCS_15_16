import java.util.Random;
public class Octopus extends SeaCreature{
    public Octopus(String name){
        setName(name);
    }
    public void swim(){
        System.out.println("Woo Hoo" + getName() + " Octopus is swimming");
    }
    public void breed(){
        Random rand = new Random();
        System.out.println(getName() + " Octopus just laid " + rand.nextInt(200000)+1 + " eggs");
    }
    public void die(){
        System.out.println("Lol.... " + getName() + " died!!!!!");
    }
}