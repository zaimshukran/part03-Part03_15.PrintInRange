
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        printNumbersInRange(null, 0, 0);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for(int number:numbers){
            if(number>=lowerLimit && number<=upperLimit){
                System.out.println(number);
            }
        }
    }
    
}
