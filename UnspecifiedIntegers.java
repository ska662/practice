
import java.io.*;
import java.util.*;
public class UnspecifiedIntegers {
    public static void main(String args[]) {
        try{
            System.out.println("Enter a no: ");
            Scanner input = new Scanner(System.in);
            String n;
            n = input.nextLine();
            int length, sum = 0;
            length = n.length();

            String strarray[] = n.split(" ");
            int intarray[] = new int[strarray.length];

            for (int count = 0; count < intarray.length; count++) {
                intarray[count] = Integer.parseInt(strarray[count]);
            }

            for (int count = 0; count < intarray.length; count++) {
                sum = sum + intarray[count];
            }
            System.out.println(sum);
        }
        catch(NumberFormatException e)
        {
            System.out.println ("Incorrect Input");
        }
    }
}

