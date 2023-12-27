import java.util.*;
public class Permutations{
    public static void permutation(int[] arr,int n) {
		List<List<Integer>> res=new ArrayList<>();
		res.add(new ArrayList<>());
		for(int i=0;i<n;i++) {
			List<List<Integer>> arr2=new ArrayList<>();
			for(int j=0;j<=i;j++){
				for(List<Integer> item:res) {
					List<Integer> temp=new ArrayList<>(item);
					temp.add(j,arr[i]);
					arr2.add(temp);
				}
			}
			res=arr2;
		}
		for(List<Integer> i:res)
		   System.out.println(i);
	}

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
		System.out.println("Enter no. of elements: ");
		int n=obj.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++)
		   arr[i]=obj.nextInt();
	    permutation(arr,n);
    }
}


/*
Enter no. of elements: 
1
Enter the elements of the array: 
1
[1]


Enter no. of elements: 
4
Enter the elements of the array: 
1 2 3 4
[4, 3, 2, 1]
[4, 3, 1, 2]
[4, 2, 3, 1]
[4, 1, 3, 2]
[4, 2, 1, 3]
[4, 1, 2, 3]
[3, 4, 2, 1]
[3, 4, 1, 2]
[2, 4, 3, 1]
[1, 4, 3, 2]
[2, 4, 1, 3]
[1, 4, 2, 3]
[3, 2, 4, 1]
[3, 1, 4, 2]
[2, 3, 4, 1]
[1, 3, 4, 2]
[2, 1, 4, 3]
[1, 2, 4, 3]
[3, 2, 1, 4]
[3, 1, 2, 4]
[2, 3, 1, 4]
[1, 3, 2, 4]
[2, 1, 3, 4]
[1, 2, 3, 4]

*/