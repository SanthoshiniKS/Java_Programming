import java.util.*;
public class Clubbed{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=obj.nextInt();
        String arr[]=new String[n];
        for (int i=0;i<n;i++)
            arr[i]=obj.next();
        Clubbed ob=new Clubbed();
        ob.clubbedwords(arr);
    }

    public void clubbedwords(String[] words){
        HashMap<String, Boolean> memo = new HashMap<>();
        Set<String> set = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for (String word : words)
            set.add(word);
        for (String word:words) {
            set.remove(word);
            if (recur(word, 0,memo,set)) ans.add(word);
            set.add(word);
        }
        System.out.println(ans);
    }

    private boolean recur(String s, int k,HashMap<String,Boolean> memo,Set<String> set) {
        String key = s + k;
        if (memo.containsKey(key)) return memo.get(key);
        if (k == s.length()) {
            memo.put(key, true);
            return true;
        }
        for (int i = k; i < s.length(); i++) {
            String sub = s.substring(k, i + 1);
            if (set.contains(sub) && recur(s, i+1,memo,set)) {
                memo.put(key, true);
                return true;
            }
        }
        memo.put(key, false);
        return false;
    }
}
