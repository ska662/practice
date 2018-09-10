import java.io.BufferedReader;
import java.io.*;

public class vowelConsonant {

    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a word");
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i)>='a' && s.charAt(i)<='z')
            {   switch (s.charAt(i))
            {   case 'a':
                System.out.print(" Vowel ");
                break;
                case 'e':
                    System.out.print(" Vowel ");
                    break;
                case 'i':
                    System.out.print(" Vowel ");
                    break;
                case 'o':
                    System.out.print(" Vowel ");
                    break;
                case 'u':
                    System.out.print(" Vowel ");
                    break;
                default:
                    System.out.print(" Consonant ");
                    break;
            }
            }

            else if (s.charAt(i)>='A' && s.charAt(i)<='Z')
            {   switch (s.charAt(i))
            {   case 'A':
                System.out.print(" Vowel ");
                break;
                case 'E':
                    System.out.print(" Vowel ");
                    break;
                case 'I':
                    System.out.print(" Vowel ");
                    break;
                case 'O':
                    System.out.print(" Vowel ");
                    break;
                case 'U':
                    System.out.print(" Vowel ");
                    break;
                default:
                    System.out.print(" Consonant ");
                    break;
            }
            }
            else
            {
                System.out.println("");
                System.out.print("Numeric Content Invalid");
                break;
            }
        }

    }
}