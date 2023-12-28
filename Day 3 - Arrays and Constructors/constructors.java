import java.util.*;
public class constructors{
    
    public constructors(){
        System.out.println("This is a no-argument constructor\n");
    }
    
    public constructors(int n){
        System.out.println("This is a parameterized constructor with value:"+n+"\n");
    }
    
    public constructors(int n,String s){
        System.out.println("This is a parameterized constructor with values:"+n+", "+s+"\n");
    }
    
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("------------------------------------------------------------");
		System.out.println("\t\tNo-argument constructor\t");
		System.out.println("------------------------------------------------------------");
		constructors c1=new constructors();
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\t\tDefault constructor\t");
		System.out.println("------------------------------------------------------------");
		example ex=new example();
		System.out.println("------------------------------------------------------------");
		System.out.println("\n\tEnter values for Parameterized constructor\t");
		System.out.println("------------------------------------------------------------");
		System.out.println("Enter a number: ");
		int n=obj.nextInt();
		System.out.println("Enter a string: ");
		String s=obj.next();
		constructors c2=new constructors(n);
		constructors c3=new constructors(n,s);
		System.out.println("------------------------------------------------------------");
	}
}

class example{
    example(){
        super();
        System.out.println("This is a Default constructor");
    }
    public void display(){
        System.out.println("Hello");
    }
}


/*
------------------------------------------------------------
		No-argument constructor	
------------------------------------------------------------
This is a no-argument constructor

------------------------------------------------------------

		Default constructor	
------------------------------------------------------------
This is a Default constructor
------------------------------------------------------------

	Enter values for Parameterized constructor	
------------------------------------------------------------
Enter a number: 
10
Enter a string: 
hello
This is a parameterized constructor with value:10

This is a parameterized constructor with values:10, hello

------------------------------------------------------------

*/