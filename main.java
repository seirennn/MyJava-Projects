import java.lang.Math;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.awt.*;

public class Main {
    
    public static void main(String[] args) {
        //given numbers in the array
       int[] numbers = {12,7,2,9,10,8};
       
       //prints the number of numbers in array
       System.out.println("Given Array is ");
       System.out.println(Arrays.toString(numbers));


              Arrays.sort(numbers);

       //print the numbers in the array+
       System.out.println("Sorted Array is ");
       System.out.println(Arrays.toString(numbers));
     
     

         
    }
}
