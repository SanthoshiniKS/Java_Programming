import java.io.*;
public class NegativeNum extends Exception{
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("test.txt");
            BufferedReader br=new BufferedReader(fr);
            int i;
            String line;
            while((line=br.readLine())!=null){
                String[] numbers=line.split("\\s+");
                for(String num:numbers){
                    int n=Integer.parseInt(num);
                    if(n>0){
                        throw new PositiveError("Positive Number found: "+n);
                    }
                    else{
                        System.out.print(n+" ");
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class PositiveError extends Exception{
    PositiveError(String msg){
        super(msg);
    }
}

/*
Contents of test.txt: -1 -2 -3 -4 -5 -4 -7 5

Output:
-1 -2 -3 -4 -5 -4 -7 PositiveError: Positive Number found: 5
*/