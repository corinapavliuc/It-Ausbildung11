import java.util.Arrays;
import java.util.Scanner;

public class Homework9_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length =scanner.nextInt();
        int[] numbers=new int[length];
        for (int i =0;i <length;i++){
            System.out.print(i+ "  index in Arrays: ");
           numbers[i]=scanner.nextInt();
        }
        Arrays.sort(numbers);
        for (int i=0; i<length-1;i++){
            if(numbers[i]!= numbers[i+1] -1) {
                System.out.println("Lost number: " + (numbers[i]+1));

            }
        }
    }
}
