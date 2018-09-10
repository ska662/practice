import java.util.Scanner;

public class panlindrome {
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int y=x.nextInt();
        int m=y,n=0;
        while(m!=0)
        {
            int numrev=0;
            numrev=m%10;
            n=n*10+numrev;
            m/=10;

        }
        if(y==n)
        {
            int sum1=0;
            System.out.print(y + " is palindrome ");
            while(n!=0)
            {
                int r=0;
                r=n%10;
                if(r%2==0)
                    sum1+=r;
                n/=10;
            }
            if(sum1>25)
                System.out.println("and the sum of even numbers is greater than 25 ");
            else
            if(sum1<25)
                System.out.println("and the sum of even numbers is less than or equal to 25 ");

        }
        else
        {
            System.out.println(y + " is not palindrome");
        }

//        System.out.println(n);
    }
}