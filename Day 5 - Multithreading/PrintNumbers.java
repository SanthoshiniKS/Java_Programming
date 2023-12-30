import java.util.*;
public class PrintNumbers {
    public static int N;
    public static int curr=1;
    public static Object lock=new Object();

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        N=obj.nextInt();
        EvenNum e=new EvenNum();
        OddNum o=new OddNum();
        e.start(); 
        o.start();
    }
}

class EvenNum extends Thread {
    @Override
    public void run() {
        while (PrintNumbers.curr<PrintNumbers.N) {
            synchronized(PrintNumbers.lock) {
                while (PrintNumbers.curr%2!=0) {
                    try {
                        PrintNumbers.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(PrintNumbers.curr+" ");
                PrintNumbers.curr++;
                PrintNumbers.lock.notify();
            }
        }
    }
}

class OddNum extends Thread {
    @Override
    public void run() {
        while(PrintNumbers.curr<PrintNumbers.N) {
            synchronized(PrintNumbers.lock){
                while(PrintNumbers.curr%2==0) {
                    try {
                        PrintNumbers.lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(PrintNumbers.curr+" ");
                PrintNumbers.curr++;
                PrintNumbers.lock.notify();
            }
        }
    }
}

/*
Enter a Number: 
10
1 2 3 4 5 6 7 8 9 10 
*/
