// Run config javac Item.java && javac Store.java && javac StoreDriver.java && java StoreDriver

public class StoreDriver{
    public static void main(String args[]){
        Store s = new Store("txt1.txt");
        s.sort();
        s.displayStore();
        s.testSearch();
    }
}