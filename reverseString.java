import java.util.Scanner;
import java.lang.String;

public class reverseString {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        String y = x.nextLine();
        y = y + '\0';
        int count = 0;

        for (int i = 0; y.charAt(i) != '\0'; i++) {
            count++;
        }
        int i=0;
        int j=count-1;
        char[] ch;
        char temp;
        ch = y.toCharArray();
        while(i<j)
        {
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<count;i++)
            System.out.print(ch[i]);



    }

}