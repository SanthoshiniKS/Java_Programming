import java.util.*;
class Average{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two floating numbers: ");
        float a=obj.nextFloat();
        float b=obj.nextFloat();
	float avg=(a+b)/2;
        System.out.printf("Average: %.2f",avg);
    }
}


/*
Enter two floating numbers: 
10.3222
15.4133
Average: 12.87
*/
