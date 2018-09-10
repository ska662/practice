import java.util.Scanner;

public class sortDecreasing {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] arr;
        arr = input.toCharArray();
        input = input + '\0';
        int count = 0;

        for (int i = 0; input.charAt(i) != '\0'; i++) {
            count++;
        }

        for (int i = 0; i < count-1; i++){
            for (int j = 0; j < count - i - 1; j++) {
                if (arr[j]-'0' < arr[j + 1]-'0') {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted number in non-increasing order : ");
        int sum1=0;
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]);
            if((arr[i]-'0')%2==0)
                sum1+=arr[i]-'0';

        }

        System.out.print("\n");
        System.out.print("Sum of even numbers : ");
        System.out.println(sum1);
        if(sum1>15)
            System.out.println("True");
        else
            System.out.println("False");




    }
}