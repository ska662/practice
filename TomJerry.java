import java.util.Scanner;

public class TomJerry {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input > 20 && input < 30) {
            if (input % 2 == 0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }
        else
        {
            System.out.println("Enter number between 20 and 30");
        }
    }
}