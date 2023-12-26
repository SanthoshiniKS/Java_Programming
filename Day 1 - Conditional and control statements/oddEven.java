import java.util.*;
class OddEven {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        int odd=0,even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        if(odd==0){
           System.out.println("There is no odd element in the given array");
           separate(arr,0,even,n);
        }
        else if(even==0){
           System.out.println("There is no even element in the given array");
           separate(arr,odd,0,n);
        }
        else
          separate(arr,odd,even,n);
    }
    public static void separate(int arr[],int odd,int even,int n){
        int k=0,j=0;
        int odd_array[]=new int[odd];
        int even_array[]=new int[even];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even_array[j]=arr[i];
                j++;
            }
            else{
                odd_array[k]=arr[i];
                k++;
            }
        }
        System.out.println("Array of Odd elements:");
        for(int i=0;i<odd;i++)
            System.out.print(odd_array[i]+" ");
        System.out.println("\nArray of Even elements:");
        for(int i=0;i<even;i++)
            System.out.print(even_array[i]+" ");
    }
}


/*
Enter no. of elements
5
Enter the elements of the array:
23 56 21 50 43
Array of Odd elements:
23 21 43 
Array of Even elements:
56 50 

*/