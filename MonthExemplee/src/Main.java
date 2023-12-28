import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int user;
        do {
            System.out.println("vvivide nomer meseta: ");
            user = scan.nextInt();
        } while (user < 1 || user >12) ;

    }
}