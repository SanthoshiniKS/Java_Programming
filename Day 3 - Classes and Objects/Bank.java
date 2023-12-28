import java.util.*;
class Bank{
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    Account accountA=new Account(12344,"aaaaa",5000);
    Account accountB=new Account(12345,"bbbbb",2500);
    System.out.println("Transfer of amount 1500 from A to B");
    accountA.transfer(accountB,1500);
    System.out.println("------------------------------------");
    System.out.println("\tReceipt for Account A\t");
    System.out.println("------------------------------------");
    accountA.printReceipt();
    System.out.println("------------------------------------");
    System.out.println("\tReceipt for Account B\t");
    System.out.println("------------------------------------");
    accountB.printReceipt();
    System.out.println("------------------------------------");
    
    System.out.println("\nTransfer of amount 3000 from B to A");
    accountB.transfer(accountA,3000);
    System.out.println("------------------------------------");
    System.out.println("\tReceipt for Account A\t");
    System.out.println("------------------------------------");
    accountA.printReceipt();
    System.out.println("------------------------------------");
    System.out.println("\n\tReceipt for Account B\t");
    System.out.println("------------------------------------");
    accountB.printReceipt();
    System.out.println("------------------------------------");
}
}
class Account{
    int accno;
    String name;
    double balance;
    public Account(int accno,String name,double balance){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
    }
    public void withdraw(double amt){
        if(amt>0 && amt<=balance){
            balance=balance-amt;
        }
        else
          System.out.println("Insufficient Balance");
    }
    public void deposit(double amt){
        balance+=amt;
    }
    public void transfer(Account toaccount,double amt){
        withdraw(amt);
        toaccount.deposit(amt);
    }
    public void printReceipt(){
        System.out.println("Account id: "+accno+"\nName: "+name+"\nAccount Balance: "+balance);
    }
}

/*
Transfer of amount 1500 from A to B
------------------------------------
	Receipt for Account A	
------------------------------------
Account id: 12344
Name: aaaaa
Account Balance: 3500.0
------------------------------------
	Receipt for Account B	
------------------------------------
Account id: 12345
Name: bbbbb
Account Balance: 4000.0
------------------------------------

Transfer of amount 3000 from B to A
------------------------------------
	Receipt for Account A	
------------------------------------
Account id: 12344
Name: aaaaa
Account Balance: 6500.0
------------------------------------

	Receipt for Account B	
------------------------------------
Account id: 12345
Name: bbbbb
Account Balance: 1000.0
------------------------------------
*/
