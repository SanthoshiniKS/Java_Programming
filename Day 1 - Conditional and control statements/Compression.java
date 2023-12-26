import java.util.*;
class Compression{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=obj.next();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            int c=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    c++;
            }
            res+=s.charAt(i);
            res+=c;
            i=i+c-1;
        }
        System.out.println(res);
    }
}

/*
Enter a string: 
abbccdd
a1b2c2d2

Enter a string: ABBBCCCCCCDEF
A1B3C6D1E1F1
*/