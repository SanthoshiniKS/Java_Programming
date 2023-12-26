import java.util.*;
public class ZPattern {
   public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s=obj.next(); 
      int n=s.length();
      int k=0;
      if(n%3==1){
         for(int i=0;i<=n/3;i++)
         {
             for(int j=0;j<=n/3;j++)
             {
                if(i==0 || i==n/3 || i+j==n/3){
                    System.out.print(s.charAt(k)+" ");
                    k++;
                }
                else
                    System.out.print("  ");
             }
             System.out.println();
         }
      }
      else{
         System.out.println("No");
      }
      
   }
}


/*
Enter a string: zohocorporationteam
z  o  h  o  c  o  r
               p
            o
         r
      a
   t
i  o  n  t  e  a  m

Enter a String: abcdefg
a b c 
  d
e f g
*/
