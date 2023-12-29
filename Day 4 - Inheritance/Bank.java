import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("1.Savings Account\n2.Checking Account\n3.Loan Account\n4.Exit");
        int n = obj.nextInt();
        while (n != 4) {
            if (n == 1) {
                System.out.println("-------------------------------");
                System.out.println("\tSavings Account\t");
                System.out.println("-------------------------------");
                System.out.println("Enter Account number:");
                int acc = obj.nextInt();
                System.out.println("Enter Initial Balance:");
                double b = obj.nextDouble();
                System.out.println("Enter Interest Rate:");
                double r = obj.nextDouble();
                SavingsAccount sa = new SavingsAccount(acc, b, r);
                operations(sa);
            } else if (n == 2) {
                System.out.println("-------------------------------");
                System.out.println("\tChecking Account\t");
                System.out.println("-------------------------------");
                System.out.println("Enter Account number:");
                int acc = obj.nextInt();
                System.out.println("Enter Initial Balance:");
                double b = obj.nextDouble();
                System.out.println("Enter Draft Limit:");
                double l = obj.nextDouble();
                CheckingAccount ca = new CheckingAccount(acc, b, l);
                System.out.println("Select one of the operations:\n1.Deposit\n2.Withdraw\n3.Check Balance:");
                int c = obj.nextInt();
                operations(ca);
            } else if (n == 3) {
                System.out.println("-------------------------------");
                System.out.println("\tLoan Account\t");
                System.out.println("-------------------------------");
                System.out.println("Enter Account number:");
                int acc = obj.nextInt();
                System.out.println("Enter Initial Balance:");
                double b = obj.nextDouble();
                System.out.println("Enter Interest Rate:");
                double r=obj.nextDouble();
                LoanAccount la=new LoanAccount(acc, b, r);
                la.accrueInterest();
                System.out.println("Account Balance: " + la.checkBalance());
            }
            System.out.println("Do you want to Check other accounts: 1-yes");
            int f = obj.nextInt();
            if (f == 1){
                System.out.println("1.Savings Account\n2.Checking Account\n3.Loan Account\n4.Exit");
                n = obj.nextInt();
            }
            else
                n = 4;
        }
    }

    public static void operations(Object s) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Select one of the operations:\n1.Deposit\n2.Withdraw\n3.Check Balance:");
        int c = obj.nextInt();
        while(c!=4){
        if (c==1) {
            System.out.println("Enter amount to be deposited: ");
            double d = obj.nextDouble();
            ((Account) s).deposit(d);
        }
        if (c==2) {
            System.out.println("Enter withdrawal amount: ");
            double w = obj.nextDouble();
            ((Account) s).withdraw(w);
        }
        if (c==3) {
            System.out.println("Account Balance: " + ((Account) s).checkBalance());
        }
        System.out.println("Do you want to proceed: 1-Yes");
        int f=obj.nextInt();
        if(f==1){
           System.out.println("Select one of the operations:\n1.Deposit\n2.Withdraw\n3.Check Balance:");
           c=obj.nextInt();
        }
        else
           c=4;
        }
    }
}


interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

abstract class BankAccount implements Account {
    int accno;
    double balance;

    public BankAccount(int acc, double b) {
        this.accno = acc;
        this.balance = b;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance after Deposit: "+balance);
        } else
            System.out.println("Invalid deposit amount.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance = balance - amount;
            System.out.println("Withdrawal amount: " + amount);
            System.out.println("Balance after withdrawal: "+balance);
        } 
        else
            System.out.println("Invalid withdrawal amount or insufficient Balance");
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    double rate;

    public SavingsAccount(int acc, double b, double r) {
        super(acc, b);
        this.rate = r;
    }

    public void addInterest() {
        double intamt = balance * rate / 100;
        balance = balance + intamt;
        System.out.println("Interest aamount: " + intamt);
    }
}

class CheckingAccount extends BankAccount {
    double draftLimit;
    public CheckingAccount(int acc, double b, double limit) {
        super(acc, b);
        this.draftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= draftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawal amount: " + amount);
            System.out.println("Balance after withdrawal: "+balance);
        } else
            System.out.println("Invalid withdrawal amount or overdraft limit reached.");
    }
}

class LoanAccount extends BankAccount {
    double rate;
    public LoanAccount(int acc, double b, double inte) {
        super(acc, b);
        this.rate = inte;
    }

    public void accrueInterest() {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest accrued: " + interest);
    }
}



/*
1.Savings Account
2.Checking Account
3.Loan Account
4.Exit
1
-------------------------------
	Savings Account	
-------------------------------
Enter Account number:
23456678
Enter Initial Balance:
40000
Enter Interest Rate:
4
Select one of the operations:
1.Deposit
2.Withdraw
3.Check Balance:
1
Enter amount to be deposited: 
455
Deposited: 455.0
Balance after Deposit: 40455.0
Do you want to proceed: 1-Yes
1
Select one of the operations:
1.Deposit
2.Withdraw
3.Check Balance:
2
Enter withdrawal amount: 
50000 
Withdrawal amount: 5000.0
Balance after withdrawal: 35455.0
Do you want to proceed: 1-Yes
1
Select one of the operations:
1.Deposit
2.Withdraw
3.Check Balance:
3
Account Balance: 35455.0
Do you want to proceed: 1-Yes
0
Do you want to Check other accounts: 1-yes
1
1.Savings Account
2.Checking Account
3.Loan Account
4.Exit
2
-------------------------------
	Checking Account	
-------------------------------
Enter Account number:
45678
Enter Initial Balance:
8000
Enter Draft Limit:
2500
Select one of the operations:
1.Deposit
2.Withdraw
3.Check Balance:
2
Enter withdrawal amount: 
500
Withdrawal amount: 500.0
Balance after Withdrawal: 7500.0
Do you want to proceed: 1-Yes
0
Do you want to Check other accounts: 1-yes
0


*/