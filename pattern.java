import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
        }
    }
}