
import java.util.ArrayList;
import java.util.Arrays;
public class Starter
{
    public static void main (String args[]){
        ArrayList<Integer> numsFile = new ArrayList<Integer>();
        
        File file = new File("100.txt");
        numsFile = file.store();
        
        Sort s = new Sort(numsFile);
        System.out.println("Bubble Sort " + s.bubbleSort());
        
        
        Sort s2 = new Sort(numsFile);
        System.out.println("Selection Sort " + s2.selectionSort());
        
        Sort s3 = new Sort(numsFile);
        System.out.println( "Intersection Sort " + s3.insertionSort());
        
        Sort s4 = new Sort(numsFile);
       int[] convert = new int[s4.convert().length];
       convert = s4.convert();
       
       
       Sort.mergeSort(convert);
       System.out.println("Merge Sort " + Arrays.toString(convert));
       
       
       
    }
}
