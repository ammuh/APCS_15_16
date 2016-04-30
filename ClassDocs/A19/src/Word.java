/**
 * 
 * @author Ammar Husain
 * @period 4
 */
public class Word {
    private String str;
    private int count;
    public Word(){
        str = "";
        count = 0;
    }
    public Word(String s){
        str = s;
        count = 1;
    }
    public String getString(){return str;}
    public int getCount(){return count;}
    public void setWord(String s){str = s;}
    public void incrementCount(){count++;}
    public void decrementCount(){count--;}
    public int compareTo(Word w){
        return this.getString().compareTo(w.getString());
    }
}
