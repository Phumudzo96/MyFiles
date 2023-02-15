import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;

public final class MyFile {
    
    public static int[] toIntArray(String input, String delimiter) {

        return  Arrays.stream(input.split(delimiter))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void main(String[] args) throws FileNotFoundException {
//Create Variables
        int min ;
        int max ;
        double avg ;
        int sum;
        int count = 0;
        String[] numArray = new String[3];
        int[] maxArray;
        int[] minArray;
        int[] sumArray;

//Read the text file

            File file = new File("test.txt");
            Scanner input = new Scanner(new FileReader(file));
    

//Read the numbers.
        
            numArray[count] = input.next();
            count++;

// Turn string into Int array after removing Min:, Max: and Avg: from the string

        minArray = toIntArray(numArray[0].replaceAll("Min:",""),",");
        maxArray = toIntArray(numArray[1].replaceAll("Max:",""),",");
        sumArray = toIntArray(numArray[2].replaceAll("Avg:",""),",");

// Use arrays.stream to find min,max and average.

        min = Arrays.stream(minArray).min().getAsInt();
        max = Arrays.stream(maxArray).max().getAsInt();
        sum = Arrays.stream(sumArray).sum();
        avg = Arrays.stream(sumArray).average().getAsDouble();

        System.out.println(" The min " + " is " + min);
        System.out.println(" The max " + " is " + max);
        System.out.println(" The sum " + " is " + sum);
        System.out.println(" The average " + " is " + avg);

        try {
            Formatter f = new Formatter("output.txt");
            
            // print the formatted strings to the file
            f.format("%s %s %s","The", "min", "is", min, ".\r\n");
            f.format("%s %s %s","The", "max", "is", max, ".\r\n");
            f.format("%s %s %s","The", "sum", "is", sum, ".\r\n");
            f.format("%s %s %s","The", "average", "is", avg, ".\r\n");
            f.close();    
            } 
      
            catch (Exception e) {
                System.out.println("Error");
            }


    }
}
