import java.util.Scanner;

public class InputDisplay {

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        char s=scan.next().charAt(0);
        if(s>='a' && s<='z')
            System.out.print("Small letter");
        else if(s>='A' && s<='Z')
            System.out.print("Capital Letter");
        else if(s>='0' && s<='9')
            System.out.print("Numerals");
        else
            System.out.print("Symbols");
    }



}
