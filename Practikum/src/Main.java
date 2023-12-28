import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(1,50);
        }
        for (int num:array){
            System.out.print(num+" ");
        }
        for (int i=1;i<array.length;i+=2){
            array[i] = 0;
        }
        System.out.println();
        for (int num:array){
            System.out.print(num+" ");
        }

    }
}