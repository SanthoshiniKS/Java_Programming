import java.util.*;
public class happy_number {
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=obj.nextInt();
        if(ishappy(num))
            System.out.println(num+" is a happy number!!!");
        else
            System.out.println(num+" is not a happy number!!!");
    }
    public static boolean ishappy(int n){
        boolean happy=false;
        for(int i=0;i<10;i++){ 
            n=SquareSum(n);
            if(n==1) {
                happy=true;
                break;
            }
        }
        return happy;
    }
    public static int SquareSum(int n) {
        int square=0;
        while (n!=0){
            square+=(n%10)*(n%10);
            n/=10;
        }
        return square;
    }
}
