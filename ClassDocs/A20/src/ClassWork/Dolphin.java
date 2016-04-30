import java.util.Random;
public class Dolphin extends SeaCreature{
    public Dolphin(String name){
        setName(name);
    }
    public void swim(){
        System.out.println("Woo Hoo" + getName() + " Dolphin is swimming");
    }
    public void breed(){
        Random rand = new Random();
        System.out.println(getName() + " Dolphin just laid " + rand.nextInt(200000)+1 + " eggs");
    }
    public void die(){
        System.out.println("Lol.... " + getName() + " died!!!!!");
    }
}