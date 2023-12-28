import java.util.*;
public class PartitionAndMerge {
    public static int[] partition_array(int[] arr, int psize, int[] order) {
        int n=0;
        if(arr.length%psize==0)
            n=arr.length/psize;
        if(arr.length%psize==1)
            n=(arr.length/psize)+1;
        int[][] partition = new int[n][];
        int index=0;
        for (int i=0;i<partition.length;i++) {
            partition[i]=Arrays.copyOfRange(arr,i* psize, Math.min((i+1)*psize,arr.length));
        }
        int[] merged=new int[arr.length];
        for (int i=0;i<order.length;i++) {
            int[] curr=partition[order[i]-1];
            for (int j=0;j<curr.length;j++)
                merged[index++]=curr[j];
        }
        return merged;
    }
    

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        System.out.println("Enter the Partition Size: ");
        int psize=obj.nextInt();
        System.out.println("Enter the size of the order: ");
        int or=obj.nextInt();
        int order[]=new int[or];
        System.out.println("Enter the order: ");
        for(int i=0;i<or;i++)
            order[i]=obj.nextInt();
        int[] merged=partition_array(arr,psize,order);
        System.out.println("Original array: "+Arrays.toString(arr));
        System.out.println("Partition size: "+psize);
        System.out.println("Merge order: "+Arrays.toString(order));
        System.out.println("Merged array: "+Arrays.toString(merged));
    }
}


/*
Enter the size of the array: 
6
Enter the elements of the array: 
1 2 3 4 5 6
Enter the Partition Size: 
2
Enter the size of the order: 
3
Enter the order: 
2 1 3
Original array: [1, 2, 3, 4, 5, 6]
Partition size: 2
Merge order: [2, 1, 3]
Merged array: [3, 4, 1, 2, 5, 6]


Enter the size of the array: 
6
Enter the elements of the array: 
1 2 3 4 5 6
Enter the Partition Size: 
4
Enter the size of the order: 
2
Enter the order: 
2 1
Original array: [1, 2, 3, 4, 5, 6]
Partition size: 4
Merge order: [2, 1]
Merged array: [5, 6, 1, 2, 3, 4]


*/