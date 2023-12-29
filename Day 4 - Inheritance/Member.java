import java.util.*;
public class Member
{
    static String name;
    static int age;
    static long pno;
    static String address;
    static double salary;
    
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your choice:\n1.Manager\n2.Employee");
		    int c=obj.nextInt();
		    int n=1;
		while (c != 1 && c != 2 && n!=3) {
            System.out.println("Invalid choice. Please enter 1 or 2.");
            c = obj.nextInt();
            n++;
        }
		if(c==1){
		    String s="Manager";
		    Manager m=new Manager();
		    System.out.println("Enter "+s+"\'s Name:");
	        m.name=obj.next();
	        System.out.println("Enter "+s+"\'s Age:");
	        m.age=obj.nextInt();
	        System.out.println("Enter "+s+"\'s Phone number:");
	        m.pno=obj.nextLong();
	        System.out.println("Enter "+s+"\'s Address:");
	        m.address=obj.next();
	        System.out.println("Enter "+s+"\'s Salary:");
	        m.salary=obj.nextDouble();
		    System.out.println("Enter "+ s +"\'s Department:");
		    m.department=obj.next();
		    System.out.println("------------------------------------");
		    System.out.println("\tManager's Details\t");
		    System.out.println("------------------------------------");
		    System.out.println(m);
		    Manager.printSalary();
		    System.out.println("------------------------------------");
		}
		if(c==2){
		    String s="Employee";
		    Employee e1=new Employee();
		    System.out.println("Enter "+s+"\'s Name:");
	        e1.name=obj.next();
	        System.out.println("Enter "+s+"\'s Age:");
	        e1.age=obj.nextInt();
	        System.out.println("Enter "+s+"\'s Phone number:");
	        e1.pno=obj.nextLong();
	        System.out.println("Enter "+s+"\'s Address:");
	        e1.address=obj.next();
	        System.out.println("Enter "+s+"\'s Salary:");
	        e1.salary=obj.nextDouble();
		    System.out.println("Enter "+ s +"\'s Specialization:");
		    e1.specialization=obj.next();
		    System.out.println("------------------------------------");
		    System.out.println("\tEmployee's Details\t");
		    System.out.println("------------------------------------");
		    System.out.println(e1);
		    e1.printSalary();
		    System.out.println("------------------------------------");
		}
	}
	
	public static void printSalary(){
	    System.out.println("Salary: "+salary);
	}
}

class Employee extends Member{
    String specialization;
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nPhoneNumber: "+pno+"\nAddress: "+address+"\nSpecialization: "+specialization;
    }
}

class Manager extends Member{
    String department;
    public String toString(){
        return "Name: "+name+"\nAge: "+age+"\nPhoneNumber: "+pno+"\nAddress: "+address+"Department: "+department;
    }
}

/*
Enter your choice:
1.Manager
2.Employee
1
Enter Manager's Name:
aaaa
Enter Manager's Age:
34
Enter Manager's Phone number:
9057493245
Enter Manager's Address:
12,aaanagar
Enter Manager's Salary:
50000
Enter Manager's Department:
HR

------------------------------------
        Manager's Details
------------------------------------
Name: aaaa
Age: 34
PhoneNumber: 9057493245
Address: 12,aaanagar
Department: HR
Salary: 50000.0
------------------------------------


Enter your choice:
1.Manager
2.Employee
2
Enter Employee's Name:
6 bbbbn
Enter Employee's Age:
3 23
Enter Employee's Phone number:
34567876543
Enter Employee's Address:
afg,gfddd
Enter Employee's Salary:
35000
Enter Employee's Specialization:
Testing
------------------------------------
	Employee's Details	
------------------------------------
Name: bbbbn
Age: 23
PhoneNumber: 34567876543
Address: afg,gfddd
Specialization: Testing
Salary: 35000.0
------------------------------------

*/