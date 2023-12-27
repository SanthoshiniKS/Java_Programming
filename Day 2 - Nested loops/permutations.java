import java.util.*;
public class permutations{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++) 
            arr[i]=obj.nextInt();
        System.out.println("Permutations: ");
        permutation(arr,n);
    }
    public static void permutation(int[] arr,int n) {
        int res[]=new int[n];
        System.out.println(Arrays.toString(arr));
        int i=0;
        while(i<n){
            if(res[i]<i){
                if(i%2==0) 
                    swap(arr,0,i);
                else 
                    swap(arr,res[i],i);
                System.out.println(Arrays.toString(arr));
                res[i]++;
                i=0;
            } 
            else{
                res[i]=0;
                i++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

/*
Enter no. of elements: 1
Enter the elements of the array: 1
[1]

Enter no. of elements:2
Enter the elements of the array:1 4
Permutations: 
[1, 4]
[4, 1]


Enter no. of elements:4
Enter the elements of the array: 1 2 3 4
Permutations: 
[1, 2, 3, 4]
[2, 1, 3, 4]
[3, 1, 2, 4]
[1, 3, 2, 4]
[2, 3, 1, 4]
[3, 2, 1, 4]
[4, 2, 1, 3]
[2, 4, 1, 3]
[1, 4, 2, 3]
[4, 1, 2, 3]
[2, 1, 4, 3]
[1, 2, 4, 3]
[1, 3, 4, 2]
[3, 1, 4, 2]
[4, 1, 3, 2]
[1, 4, 3, 2]
[3, 4, 1, 2]
[4, 3, 1, 2]
[4, 3, 2, 1]
[3, 4, 2, 1]
[2, 4, 3, 1]
[4, 2, 3, 1]
[3, 2, 4, 1]
[2, 3, 4, 1]

*/
