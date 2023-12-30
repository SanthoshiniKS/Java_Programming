/* Without setting name for Threads */
public class Threading implements Runnable
{
    public void run(){
        System.out.println("Thread Name: "+Thread.currentThread().getName());
    }
	public static void main(String[] args) {
		Threading th=new Threading();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		t1.start();
		t2.start();
	}
}

/*
Output:
Thread Name: Thread-0
Thread Name: Thread-1
*/