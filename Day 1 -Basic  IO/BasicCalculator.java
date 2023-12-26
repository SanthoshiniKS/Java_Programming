import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a=obj.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        char op=obj.next().charAt(0);
        System.out.print("Enter the second number: ");
        double b=obj.nextDouble();
        double ans=0;
        boolean validop=true;
            if(op=='+')
                ans=a+b;
            else if(op=='-')
                ans=a-b;
            else if(op=='*')
                ans=a*b;
            else if(op=='/'){
                if(b!=0)
                    ans=a/b;
                 else{
                    System.out.println("Error: Division by zero is not allowed.");
                    validop=false;
                }
            }
            else{
               System.out.println("Error: Invalid operator.");
               validop=false;
            }
        
        if(validop)
            System.out.printf("Result: %.2f",ans);
    }
}

/*
Enter the first number: 12.343
Enter the operator (+, -, *, /): *
Enter the second number: 2
Result: 24.69
*/
