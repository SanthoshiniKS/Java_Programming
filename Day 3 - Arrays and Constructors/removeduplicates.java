import java.util.*;
public class removeduplicates
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=obj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		   arr[i]=obj.nextInt();
	    int res=removeDuplicates(arr);
	    System.out.println(res);
	}
	public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        } 
        return j;
    }
}

/*
Input:
Enter the size of the array: 
10
Enter the elements of the array: 
0 0 1 1 1 2 2 3 3 4
Output:
5

Input:
Enter the size of the array: 
7
Enter the elements of the array: 
22 22 44 44 88 89 89
Output:
4

*/