import java.util.*;
public class Clubbed{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=obj.nextInt();
        String arr[]=new String[n];
        for (int i=0;i<n;i++)
            arr[i]=obj.next();
        List<String> clubbedWords=findClubbedWords(arr,n);
        System.out.println(clubbedWords); 
    }

    public static List<String> findClubbedWords(String[] words,int n) {
        List<String> clubbedWords=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++)
           set.add(words[i]);
        for(String word:words) {
            if(isClubbed(word,set))
                clubbedWords.add(word);
        }
        return clubbedWords;
    }

    public static boolean isClubbed(String word,HashSet<String> set) {
        for(int i=1;i<word.length();i++) {
            String pre=word.substring(0, i);
            String suf=word.substring(i);
            if(set.contains(pre) && set.contains(suf)) 
                return true;
            if(isClubbed(suf,set))
                return true;
        }
        return false;
    }
}

/*
Enter no. of elements: 
8
Enter the elements: mat mates bellmates matbellmates bell butter ribbon butterribbon
Output:
[bellmates, matbellmates, butterribbon]
*/
