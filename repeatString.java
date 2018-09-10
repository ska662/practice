import java.util.Scanner;

public class repeatString {
    public static void main(String args[]) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String input = scan1.nextLine();
        int n = scan2.nextInt();
        char[] arr;
        arr = input.toCharArray();
        input = input + '\0';
        int count = 0;

        for (int i = 0; input.charAt(i) != '\0'; i++) {
            count++;
        }
        for (int i = 0; i < count; i++)
            System.out.print(arr[i]);

        for(int j=0;j<n;j++)
        {
            for(int i=count-n;i<count;i++)
                System.out.print(arr[i]);
        }

    }
}