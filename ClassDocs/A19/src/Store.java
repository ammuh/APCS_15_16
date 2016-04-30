import java.util.*;
import java.io.*;
/**
 * 
 * @author Ammar Husain
 * @period 4
 *
 */
public class Store {
    private ArrayList < Item > myStore = new ArrayList < Item > ();
    public Store(String fName) {
        loadFile(fName);
    }
    public Store() {

    }
    private void loadFile(String inFileName) {
        try {
            Scanner s = new Scanner(new File(inFileName));
            while (s.hasNextLine()) {
                myStore.add(new Item(s.nextInt(), s.nextInt()));
            }
        }
        catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("File Not Found!");
            }
        }

    }
    public void displayStore() {
        System.out.println("          Id       Inv");
        System.out.println();
        System.out.print(this);
    }
    public String toString() {
        String s = "";
        for (int elem = 0; elem < myStore.size(); elem++) {
            Formatter f = new Formatter();
            f.format("%2d%s%n", (elem + 1), myStore.get(elem).toString());
            s += f.toString();
            if ((elem + 1) % 10 == 0 && elem != 0) {
                s += "\n";
            }
        }
        return s;
    }
    public void sort() {
            myStore = mergeSort(myStore);
        } //to get recursive sort going

    //DIFFERENT IMPLEMENTATION
    public ArrayList < Item > merge(ArrayList < Item > l1, ArrayList < Item > l2) {
        ArrayList < Item > merged = new ArrayList < Item > ();
        while (l1.size() > 0 && l2.size() > 0) {
            if (l1.get(0).compareTo(l2.get(0)) < 0) {
                merged.add(l1.get(0));
                l1.remove(0);
            }
            else {
                merged.add(l2.get(0));
                l2.remove(0);
            }
        }
        if (l1.size() == 0) {
            for (Item i: l2) {
                merged.add(i);
            }
        }
        else {
            for (Item i: l1) {
                merged.add(i);
            }
        }
        return merged;
    }

    public ArrayList < Item > mergeSort(ArrayList < Item > l) {
        if (l.size() == 1) {
            return l;
        }
        int mid = l.size() / 2;
        return merge(mergeSort(new ArrayList < Item > (l.subList(0, mid))), mergeSort(new ArrayList < Item > (l.subList(mid, l.size()))));
    }

    public void testSearch(){ 
        int idToFind; 
        int invReturn; 
        int index; 
        Scanner in = new Scanner(System.in); 
    
        System.out.println("Testing search algorithm\n"); 
        do{ 
            System.out.println(); 
            System.out.print("Enter Id value to search for (-1 to quit) --> "); 
            idToFind = in.nextInt(); 
            if (idToFind >= 0) { 
               //index = bsearch(new Item(idToFind, 0)); 
               //recursive version call 
               index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1); 
               System.out.print("Id # " + idToFind +":"); 
               if (index == -1){ 
                    System.out.println(" No such part in stock"); 
                }else{ 
                    System.out.println(" Inventory = " + myStore.get(index).getInv()); 
                } 
            } 
        } while (idToFind >= 0); 
    } 
    
    /** 
     * Searches the myStore ArrayList of Item Objects for the specified 
     * item object using a iterative binary search algorithm 
     * 
     * @param idToSearch Item object containing id value being searched for 
     * @return index of Item if found, -1 if not found 
     */

    private int bsearch(Item idToSearch) {
        int low = 0;
        int high = myStore.size() -1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (myStore.get(mid).getId() > idToSearch.getId()) {
                high = mid - 1;
            } else if (myStore.get(mid).getId() < idToSearch.getId()) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    
    /** 
     * Searches the specified ArrayList of Item Objects for the specified 
     * id using a recursive binary search algorithm 
     * 
     * @param idToSearch Id value being search for 
     * @param first Starting index of search range 
     * @param last Ending index of search range 
     * @return index of Item if found, -1 if not found 
     */
    private int bsearch(Item idToSearch, int first, int last) {
        if(first > last){
            return -1;
        }
        int mid = (first + last) / 2;
        if (myStore.get(mid).getId() > idToSearch.getId()) {
            return bsearch(idToSearch, first, mid -1);
        } else if (myStore.get(mid).getId() < idToSearch.getId()) {
            return bsearch(idToSearch, mid + 1, last);
        } else {
            return mid;
        }
    }
}