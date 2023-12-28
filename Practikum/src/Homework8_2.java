import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Homework8_2 {
    public static void main(String[] args) {
        int[] numbers = new int [5];
        Random random= new Random();
        for (int i =0;i < numbers.length;i++){
            numbers[i]=random.nextInt(10,100);

        }
        System.out.println(Arrays.toString(numbers));

        for (int i=0;i< numbers.length-1;i++){
            if (numbers[i] <numbers[i+1]){
                System.out.println("The array is not a strictly increasing sequence.");
                break;
            }else{
                System.out.println("The array is  a strictly increasing sequence.");

            }

        }

    }


}
