class Palindrome extends Thread{
    public void run(){
        System.out.print("Palindrome Numbers from 10 to 50: ");
        for(int i=10;i<=50;i++){
            int temp=i,n=i,rem,sum=0;    
            while(n>0){    
                 rem=n%10; 
                 sum=(sum*10)+rem;    
                 n=n/10;    
            }    
            if(temp==sum)    
                System.out.print(i+" ");
        }
    }
}

class Prime extends Thread{
    public void run(){
        System.out.print("\nPrime Numbers from 0 to 10: ");
        for (int i=2;i<=10;i++) {
            int c=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    c++;
                    break;
                }
            }
            if(c==0)
               System.out.print(i+" ");
        }    
    }
}

public class Print{
    public static void main(String[] args) {
        Palindrome pal=new Palindrome();
        Prime pr=new Prime();
        pal.start();
        try{
            pal.join();
        } 
        catch(InterruptedException e){
            e.printStackTrace();
        }
        pr.start();
    }
}

/*
Palindrome Numbers from 10 to 50: 11 22 33 44 
Prime Numbers from 0 to 10: 2 3 5 7 
*/