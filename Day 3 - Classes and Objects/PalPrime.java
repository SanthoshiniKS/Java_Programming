import java.util.Scanner;
public class PalPrime {
    public PalPrime(int num){
            boolean ispalindrome=check_palindrome(num);
            boolean isprime=check_prime(num);
            if(ispalindrome && isprime)
                System.out.println("Number "+num+" is " +"PalPrime");
            else if(ispalindrome)
                System.out.println("Number "+num+" is " +"Palindrome");
            else if(isprime)
                System.out.println("Number "+num+" is " +"Prime");
            else
                System.out.println("Number "+num+" is " +"neither Palindrome nor Prime and not PalPrime");
    }
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<n;i++) 
            arr[i]=obj.nextInt();
        for (int i=0;i<n;i++){
           new PalPrime(arr[i]);
        }
        
    }
    public static boolean check_palindrome(int num) {
        int rev=0,x=num;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return x==rev;
    }

    public static boolean check_prime(int num) {
        if (num<=1) 
            return false;
        for (int i=2;i*i<=num;i++) {
            if (num%i==0) 
                return false;
        }
        return true;
    }
}
