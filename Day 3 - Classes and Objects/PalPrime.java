import java.util.Scanner;
public class PalPrime {
    
    public PalPrime(int num,String message){
        System.out.println("Number "+num+" is "+message);
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
        String a="";
        for (int i=0;i<n;i++){
           String message=PalPrime.display(arr[i]);
           new PalPrime(arr[i],message);
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
    
    public static String display(int num){
            boolean ispalindrome=check_palindrome(num);
            boolean isprime=check_prime(num);
            if(ispalindrome && isprime)
                return "PalPrime";
            else if(ispalindrome)
                return "Palindrome";
            else if(isprime)
                return "Prime";
            else
                return "neither Palindrome nor Prime and not PalPrime";
    }
}


/*
Enter the size of the array: 5
Enter the elements of the array: 
1 34543 565 727 10099
Number 1 is Palindrome
Number 34543 is PalPrime
Number 565 is Palindrome
Number 727 is PalPrime
Number 10099 is Prime

Enter the size of the array: 
7
Enter the elements of the array: 
13 2114 644 211 567 8999 2
Number 13 is Prime
Number 2114 is neither Palindrome nor Prime and not PalPrime
Number 644 is neither Palindrome nor Prime and not PalPrime
Number 211 is Prime
Number 567 is neither Palindrome nor Prime and not PalPrime
Number 8999 is Prime
Number 2 is PalPrime
*/
