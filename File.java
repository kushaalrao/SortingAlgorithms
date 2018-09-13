import com.opencsv.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class File
{
    private CSVReader reader;
    
    String[] nums;
    ArrayList<Integer> numbers;
    //ArrayList<int> noZeros;
    public File(String fileName){
        nums = new String[1000];
        FileReader file;
        numbers = new ArrayList<Integer>();
        //noZeros = new ArrayList<String>();
        try{
            file = new FileReader(fileName);
            reader = new CSVReader(file, '\t');
        }catch (Exception e) {
            file = null;
            System.out.println(e.getMessage());
            
        }
    }

    public ArrayList<Integer> store(){
        
        try{
            while((nums = reader.readNext()) != null){

                numbers.add(Integer.valueOf(nums[0]));
                
               
                
                
            }
        }
        catch (IOException io) {
            System.out.println(io.getMessage());
        }
        
        return numbers;
    }
}
