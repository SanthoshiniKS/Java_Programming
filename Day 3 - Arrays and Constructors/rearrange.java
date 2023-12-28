import java.util.*;
public class rearrange
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=obj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		   arr[i]=obj.nextInt();
	    rearrange.separate(arr);
	}
	public static void separate(int arr[]){
	    ArrayList<Integer> neg=new ArrayList<>();
	    ArrayList<Integer> pos=new ArrayList<>();
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]<0)
	           neg.add(arr[i]);
	        else
	           pos.add(arr[i]);
	    }
	    int k=0;
	    for(int i=0;i<arr.length;i++){
	        if(i<neg.size())
	            arr[i]=neg.get(i);
	        else{
	            arr[i]=pos.get(k);
	            k++;
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
}

/*
Enter the size of the array: 
9
Enter the elements of the array: 
-12 11 -13 -5 6 -7 5 -3 -6
[-12, -13, -5, -7, -3, -6, 11, 6, 5]



Enter the size of the array: 
5
Enter the elements of the array: 
23 43 -5 -3 -8
[-5, -3, -8, 23, 43]

*/