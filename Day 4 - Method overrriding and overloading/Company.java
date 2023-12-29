import java.util.*;
public class Company {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int c=1;
        while(c==1 || c==2){
            System.out.println("1.Manager\n2.Developer\n3.Exit\nEnter your choice: ");
            c=obj.nextInt();
            if(c==1){
                System.out.println("Enter Manager name: ");
                String name=obj.next();
                System.out.println("Enter Employee Id: ");
                int empid=obj.nextInt();
                System.out.println("Enter Bonus Percentage: ");
                double b=obj.nextDouble();
                Manager m=new Manager(name,empid,b);
                System.out.println("-------------------------------------");
                System.out.println("\tManager Details\t");
                System.out.println("-------------------------------------");
                System.out.println(m);
                System.out.println("Salary: "+m.calculateSalary());
                System.out.println("-------------------------------------");
            }
            if(c==2){
                System.out.println("Enter Developer name: ");
                String name=obj.next();
                System.out.println("Enter Employee Id: ");
                int empid=obj.nextInt();
                System.out.println("Enter Programming Language: ");
                String p=obj.next();
                Developer d=new Developer(name,empid,p);
                System.out.println("-------------------------------------");
                System.out.println("\tDeveloper Details\t");
                System.out.println("-------------------------------------");
                System.out.println(d);
                System.out.println("Salary: "+d.calculateSalary());
                System.out.println("-------------------------------------");
               }
        }
    }
}

class Employee{
    String name;
    int empid;
    double salary=50000;
    public Employee(String n,int emp){
        this.name=n;
        this.empid=emp;
    }
    public double calculateSalary(){
        return salary;
    }
    public String toString(){
        return "Employee Id: "+empid+"\nName: "+name+"\nBasic Salary: "+salary;
    }
}

class Manager extends Employee{
    double bonuspercentage;
    Manager(String n,int empid,double bonus){
        super(n,empid);
        this.bonuspercentage=bonus;
    }
    public double calculateSalary(){
        double s=super.calculateSalary();
        return s+(s*bonuspercentage/100);
    }
    public String toString(){
        return super.toString()+"\nBonus Percentage: "+bonuspercentage+"%";
    }
}

class Developer extends Employee{
    String proglang;
    Developer(String n,int emp,String prog){
        super(n,emp);
        this.proglang=prog;
    }
    public double calculateSalary(){
        double extra=20000;
        return super.calculateSalary()+extra;
    }
    public String toString(){
        return super.toString()+"\nProgramming Language: "+proglang;
    }
}

/*
1.Manager
2.Developer
3.Exit
Enter your choice:
1
Enter Manager name:
aaa
Enter Employee Id:
12001
Enter Bonus Percentage:
10
-------------------------------------
Manager Details
-------------------------------------
Employee Id: 12001
Name: aaa
Basic Salary: 50000.0
Bonus Percentage: 10.0%
Salary: 55000.0
-------------------------------------
1.Manager
2.Developer
3.Exit
Enter your choice:
2
Enter Developer name:
bbbb
Enter Employee Id:
32222
Enter Programming Language:
Java
-------------------------------------
Developer Details
-------------------------------------
Employee Id: 32222
Name: bbbb
Basic Salary: 50000.0
Programming Language: Java
Salary: 70000.0
-------------------------------------
1.Manager
2.Developer
3.Exit
Enter your choice:
3

*/