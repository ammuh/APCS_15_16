import java.util.Random;
public class Fish extends SeaCreature{
    public Fish(String name){
        setName(name);
    }
    public void swim(){
        System.out.println("Woo Hoo" + getName() + " Fish is swimming");
    }
    public void breed(){
        Random rand = new Random();
        System.out.println(getName() + " Fish just laid " + rand.nextInt(500)+1 + " eggs");
    }
    public void die(){
        System.out.println("Lol.... " + getName() + " died!!!!!");
    }
}