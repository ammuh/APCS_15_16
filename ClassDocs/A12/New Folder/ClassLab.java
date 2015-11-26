public class ClassLab{
    public static void main(String args[]){
        printDiagonallyWhile(12);
    }
    
    public static void printDiagonallyWhile(int n){
        int i = 0;
        while(i <=5){
            int temp = i;
            while(i > 0){
                System.out.print("-");
                i--;
            }
            i = temp;
            System.out.print(2*i + n);
            while(i < 5){
                System.out.print("-");
                i++;
            }
            System.out.println();
            i = temp;
            i++;
        }
    }
}