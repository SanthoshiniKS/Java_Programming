import java.util.Scanner;
public class PrintNumbers2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
	int mid=0;
        if(n%2!=0)
          mid=(n+1)/2;
        else 
	  mid=n/2;
        Thread t1=new Thread(new printNum(1,mid));
        Thread t2=new Thread(new printNum(mid+1,n));
        t1.start();
        t2.start();
    }
}

class printNum implements Runnable{
    int start;
    int end;
    public printNum(int s,int e) {
        this.start=s;
        this.end=e;
    }
    public void run() {
        for (int i=start;i<=end;i++) {
            System.out.print(i+" ");
        }
    }
}

/*
Enter the value of N: 5
1 2 3 4 5 
*/