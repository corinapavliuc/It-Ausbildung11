import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first string: ");
          String a = sc.nextLine();
          System.out.println("Enter the second string: ");
          String b = sc.nextLine();
          System.out.println(a.substring(0,a.length()/2)+b.substring(b.length()/2));

      }

    }


