import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Ammar Husain
 * @period 4
 */

public class CountWords {
    private ArrayList<Word> words;
    private String file;
    public CountWords(String f){
        file = f;
        loadFile(f);
    }
    public void loadFile(String fName){
        words = new ArrayList<Word>();
        try{
            Scanner s = new Scanner(new File(fName));
            while(s.hasNext()){
                String temp = s.next().toLowerCase();
                temp = tokenClean(temp);
                if(temp.length() == 0){
                    
                }else if(findWord(temp) == -1){
                    words.add(new Word(temp));
                    sortWords(0, words.size()-1);
                }else{
                    words.get(findWord(temp)).incrementCount();
                }
            }
        }catch(Exception e){
            System.out.println("EXCEPTION FOUND");
        }
    }
    private String tokenClean(String s){
        s = s.trim();
        if(s.length() == 1 && !isAlphaNum(s.charAt(0))){
            s = "";
        }else{
            s = recEdgeTrim(s);
        }
        return s;
    }
    private String recEdgeTrim(String s){
        if(s.length() == 0){
            return s;
        }
        if(s.length() >0 && !isAlphaNum(s.charAt(s.length()-1))){
            return recEdgeTrim(s.substring(0, s.length()-1));
        }
        if(s.length() >0 && !isAlphaNum(s.charAt(0))){
            return recEdgeTrim(s.substring(1));
        }
        return s;
    }
    private boolean isAlphaNum(char c){
        if(((int)c > 96 && (int)c < 123) || ((int)c > 47 && (int)c < 58)){
            return true;
        }
        return false;
    }
    private int findWord(String s) {
        int low = 0;
        int high = words.size() -1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (words.get(mid).compareTo(new Word(s)) > 0) {
                high = mid - 1;
            } else if (words.get(mid).compareTo(new Word(s)) < 0) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public void sortWords(int low, int high) {
		if (words == null || words.size() == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int mid = low + (high - low) / 2;
		Word pivot = words.get(mid);
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (words.get(i).compareTo(pivot) < 0) {
				i++;
			}
 
			while (words.get(j).compareTo(pivot) > 0) {
				j--;
			}
 
			if (i <= j) {
				Word temp = words.get(i);
				words.set(i, words.get(j));
				words.set(j, temp);
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			sortWords(low, j);
 
		if (high > i)
			sortWords(i, high);
	}
	
    public void printStats(){
        System.out.println("File: " + file);
        System.out.println("Total number of unique words used in the file: "+ words.size());
        long total = 0;
        for(Word w : words){
            total += w.getCount();
        }
        System.out.println("Total number of words in file: " + total);
        System.out.println("Top 30 words are: ");
        
        ArrayList<Integer> found = new ArrayList<Integer>();
        int count;
        if(words.size() >= 30){
            count = 31;
        }else{
            count = words.size() +1;
        }
        for(int i = 1; i < count; i++){
            int largest = -1;
            int pos = 0;
            for(int w = 0; w < words.size(); w++){
                if(!found.contains(w)){
                    if(largest == -1){
                        pos = w;
                        largest = words.get(w).getCount();
                    }else{
                        if(largest < words.get(w).getCount()){
                            pos = w;
                            largest = words.get(w).getCount();
                        }
                    }
                }
            }
            found.add(pos);
            Word elem = words.get(pos);
            System.out.printf("%2d%6d%12s\n", i-1, elem.getCount(), elem.getString());
        }
        
    }
}
