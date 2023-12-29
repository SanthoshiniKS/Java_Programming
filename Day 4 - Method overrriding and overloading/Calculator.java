import java.util.*;
public class Calculator{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter inputs for Method 1");
		System.out.println("Enter value 1: ");
		int a=obj.nextInt();
		System.out.println("Enter value 2: ");
		int b=obj.nextInt();
		System.out.println("Multiplied value: "+multiply(a,b));
		System.out.println("\nEnter inputs for Method 2");
		System.out.println("Enter value 1: ");
		double n1=obj.nextDouble();
		System.out.println("Enter value 2: ");
		double n2=obj.nextDouble();
		System.out.println("Enter value 3: ");
		double n3=obj.nextDouble();
		System.out.printf("Multiplied value: "+multiply(n1,n2,n3));
	}
	
	public static int multiply(int a,int b){
	    return a*b;
	}
	public static double multiply(double a,double b,double c){
	    return a*b*c;
	}
}

/*
Enter inputs for Method 1
Enter value 1: 
5
Enter value 2: 
10
Multiplied value: 50

Enter inputs for Method 2
Enter value 1: 
3.4
Enter value 2: 
2.7
Enter value 3: 
5.5
Multiplied value: 50.489999999999995
*/