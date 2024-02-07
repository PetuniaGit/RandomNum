import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("choose a number");
        Scanner scan=  new Scanner(System.in);
         String a = scan.next ();
        System.out.println(a);
        Random rand = new Random();
        int x = rand.nextInt();
        System.out.println(x);
    }
}
