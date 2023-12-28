import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class palprime {
    private int number;
    private String message;

    public palprime(int number) {
        this.number=number;
        this.message=display();
        System.out.println("Number "+number+" is " +message);
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size=scanner.nextInt();
        int[] array=new int[size];

        System.out.println("Enter the elements: ");
        for (int i=0;i<size;i++) 
        {
            array[i]=scanner.nextInt();
        }

        for (int num:array) 
        {
            new palprime(num);
        }

        scanner.close();
    }

    private String display() {
        boolean ispalindrome=check_palindrome(number);
        boolean isprime=check_prime(number);

        if (ispalindrome&&isprime) 
        {
            return "PalPrime";
        } 
        else if (ispalindrome) 
        {
            return "Palindrome";
        } 
        else if (isprime) 
        {
            return "Prime";
        } 
        else 
        {
            return "Neither Palindrome nor Prime";
        }
    }

    private boolean check_palindrome(int num) {
        int reverse=0;
        int original=num;

        while (num != 0) 
        {
            int digit=num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        return original==reverse;
    }

    private boolean check_prime(int num) 
    {
        if (num<=1) 
        {
            return false;
        }
        for (int i=2;i*i<=num;i++) 
        {
            if (num%i==0) 
            {
                return false;
            }
        }
        return true;
    }
}
