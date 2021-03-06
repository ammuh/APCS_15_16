import java.util.*;

/**
 *  Description of the Class
 *
 * @author     Your Name Here
 * @period     #
 */
public class Sorts {
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public Sorts() {
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList < Comparable > list) {
        int end = list.size();
        while(0 < end){
            for(int i = 1; i < end; i++){
                setStepCount(getStepCount()+3);
                if(list.get(i-1).compareTo(list.get(i)) > 0){
                    swap(list, i, i-1);
                }
            }
            end--;
        }
        //Add your code here
        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList < Comparable > list) {
        int end = -1;
        ArrayList newList =  new ArrayList();
        while(list.size() > 0){
            Comparable smallest = list.get(0);
            setStepCount(getStepCount()+1);
            int pos = 0;
            int spos=0;
            for(Comparable elem : list){
                setStepCount(getStepCount()+2);
                if(elem.compareTo(smallest) < 0){
                    smallest = elem;
                    setStepCount(getStepCount()+1);
                    spos = pos;
                }
                pos++;
            }
            list.remove();
            swap(list, pos, end);
        }
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList < Comparable > list) {
        
        int pos = 1;
        while(pos < list.size()){
            setStepCount(getStepCount()+3);
            if(list.get(pos).compareTo(list.get(pos-1)) < 0){
                int temp = pos;
                setStepCount(getStepCount()+3);
                while(pos > 0 && list.get(pos).compareTo(list.get(pos-1)) < 0){
                    swap(list, pos, pos-1);
                    pos--;
                }
                setStepCount(getStepCount()-3);
                pos= temp;
            }
            pos++;
        }
        
        //Add your code here
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
    }


    /**
     *  Takes in entire vector, but will merge the following sections
     *  together:  Left sublist from a[first]..a[mid], right sublist from
     *  a[mid+1]..a[last].  Precondition:  each sublist is already in
     *  ascending order
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  mid    midpoint index of range of values to be sorted
     * @param  last   last index of range of values to be sorted
     */
    private void merge(ArrayList < Comparable > a, int first, int mid, int last) {
        //Add your code here


    }

    /**
     *  Recursive mergesort of an array of integers
     *
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void mergeSort(ArrayList < Comparable > a, int first, int last) {
        //Add your code here

    }

    /**
     *  Description of the Method
     *  
     * @param  a      reference to an array of integers to be sorted
     * @param  first  starting index of range of values to be sorted
     * @param  last   ending index of range of values to be sorted
     */
    public void quickSort(ArrayList < Comparable > a, int first, int last) {
            //Add your code here

        }
        /**
         *  Accessor method to return the current value of steps
         *
         */
    public long getStepCount() {
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(long stepCount) {
        steps = stepCount;
    }

    /**
     *  Interchanges two elements in an ArrayList
     *
     * @param  list  reference to an array of integers
     * @param  a     index of integer to be swapped
     * @param  b     index of integer to be swapped
     */
    public void swap(ArrayList < Comparable > list, int a, int b) {
        Comparable temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
        setStepCount(getStepCount()+4);
    }
}
