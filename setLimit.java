import java.util.Scanner;

public class setLimit {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input > 100)
            System.out.println("Number guessed is more than the original number");
        else if (input < 1)
            System.out.println("Number guessed is less than the original number");
        else
            System.out.println("Number guessed matches the original number");
    }
}