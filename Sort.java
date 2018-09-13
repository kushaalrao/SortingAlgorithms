
import java.util.ArrayList;
import java.util.Arrays;
public class Sort
{
    ArrayList<Integer> textFile;
    public Sort(ArrayList<Integer> t)
    {
        //textFile = new ArrayList<Integer>();
        textFile = t;
    }

    public ArrayList<Integer> bubbleSort(){

        int temp;
        int temp2;
        for(int i = 0; i < textFile.size()-1; i++){
            for(int k = 0; k < textFile.size()-1; k++){
                if(textFile.get(k) > textFile.get(k+1)){
                    temp= textFile.get(k);
                    temp2= textFile.get(k+1);
                    textFile.set(k, temp2);
                    textFile.set(k+1, temp);

                    //System.out.println(textFile);
                }
            }
        }

        return textFile;
    }

    public ArrayList<Integer> selectionSort(){
        int smallestIndex;
        int small;
        for (int i = 0; i < textFile.size() ; i++)
        {
            small= textFile.get(i);
            smallestIndex = i;

            for(int k = smallestIndex; k < textFile.size() ; k++){
                if(small > textFile.get(k)){
                    small= textFile.get(k);
                    smallestIndex = k;
                }
            }

            if (smallestIndex == i)
                ;
            // swap values otherwise
            else {
                int temp = textFile.get(i);
                textFile.set(i, textFile.get(smallestIndex));
                textFile.set(smallestIndex, temp);
            }
        }
        return textFile;
    }

    public ArrayList<Integer> insertionSort(){
        int temp;
        for (int i = 0; i < textFile.size(); i++) {

            for(int j = i ; j > 0 ; j--){
                if(textFile.get(j) < textFile.get(j-1)){
                    temp = textFile.get(j);
                    //input[j] = input[j-1];

                    textFile.set(j, textFile.get(j-1));
                    textFile.set(j-1, temp);
                    //input[j-1] = temp;
                }
            }
        }
        return textFile;

    }

    public  int[] convert(){
        int[] array = new int[textFile.size()];
        for(int i = 0; i < textFile.size(); i++){
            array[i] = textFile.get(i);
        }
        return array;
    }

    public void callSorter(int[] list)
    {
        mergeSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void mergeSort(int[] arr) {

        if (arr.length < 2) return;

        int mid = arr.length/2;
        int[] l = Arrays.copyOf(arr, mid);
        int[] r = Arrays.copyOfRange(arr, mid, arr.length);

        //System.out.println("left: " + l.length + " " + Arrays.toString(l));
        //System.out.println("right: " + r.length + " " + Arrays.toString(r));
        mergeSort(l);
        mergeSort(r);
        merge(l, r, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        
        int i=0;
        int j=0;
        int k=0;
        
        while (i< left.length && j < right.length) {
            //System.out.println("merged:Comparing " + left[i] + " and " + right[j]);
            if ( left[i] <= right[j] ) {
            //System.out.println("merged:Adding " + left[i] + " to array");
            arr[k] = left[i];
            i = i+1;
 
        }
        else {
            //System.out.println("merged:Adding " + right[j] + " to array");
            arr[k] = right[j];
            j = j+1;

        }
        
        k = k+1;
  
        
    }
        if (i < left.length){
        
        for (int z=i; z <left.length; z++){
        arr[k] = left[z];
        k++;
      
        }
    }
        
        if (j < right.length){
        
        for (int z=j; z <right.length; z++){
        arr[k] = right[z];
        k++;
      
        }
    }
    
    
        //System.out.println("merged: " +Arrays.toString(arr));
        //System.out.println("Left: " +Arrays.toString(left));
        //System.out.println("Right: " +Arrays.toString(right));
}

    public static void merge1(int[] left, int[] right, int[] arr) {

        int k = 0;
        int c = 0;

        for(int z=0; z<left.length && z<right.length; z++) {
            if(left[z]<=right[z]) {
                arr[c] = left[z];
                c++;
            } else {
                arr[c] = right[z];
                c++;
            }
        }

        for(int z=0; z<left.length; z++) {
            arr[c] = left[z];
            c++;
        }

        for(int z=0; z<right.length; z++) {
            arr[c] = right[z];
            c++;
        }

        //System.out.println("merged: " +Arrays.toString(arr));
    }
}
