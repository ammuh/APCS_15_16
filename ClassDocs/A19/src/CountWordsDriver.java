//javac Word.java && javac CountWords.java && javac CountWordsDriver.java && java CountWordsDriver
public class CountWordsDriver{
    public static void main(String args[]){
        CountWords c = new CountWords("dream.txt");
        c.printStats();
    }
}