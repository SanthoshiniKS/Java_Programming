import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter no. of elements: ");
		int n=obj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		   arr[i]=obj.nextInt();
		int res[]=new int[n];
		for(int i=0;i<n;i++){
		    int k=1;
		    for(int j=0;j<n;j++){
		        if(i!=j){
		            k=k*arr[j];
		            res[i]=k;
		        }
		    }
		}
		System.out.println("Output:");
		for(int i=0;i<n;i++)
		   System.out.print(res[i]+" ");
	}
}


/*
Enter no. of elements: 
5
Enter the elements of the array: 
1 4 5 6 8
Output:
960 240 192 160 120 
*/