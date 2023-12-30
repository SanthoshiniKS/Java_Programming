import java.util.*;
import java.io.*;
public class FileRead {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the File Path:");
        String path=obj.next();
        try{
            FileReader fr=new FileReader(path);
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }  
}

/*
Enter the File Path:
C:\Users\ELCOT\Documents\NetBeansProjects\placement\src\Vehicle.java
public class Vehicle {
    public static void main(String[] args) {
        // TODO code application logic here
    }    
}
*/