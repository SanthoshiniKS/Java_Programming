import java.io.*;
import java.util.*;
public class CommonWord {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Directory path: ");
        String d = obj.next();
        Map<String, Integer> wordcount = new HashMap<>();
        try {
            File f = new File(d);
            File[] fi = f.listFiles();
            for (File a : fi) {
                if (a.isFile()) {
                    processFile(a, wordcount);
                }
            }
            int max = 0;
            for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
                int fre = entry.getValue();
                if (fre > max) {
                    max = fre;
                }
            }
            System.out.println("Common Words");
            for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void processFile(File file, Map<String, Integer> wc) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.toLowerCase().split("\\s+");
            for (String word : words) {
                wc.put(word, wc.getOrDefault(word, 0) + 1);
            }
        }
        br.close();
    }
}
/*
Enter Directory path:
C:\Users\ELCOT\Documents\NetBeansProjects\SampleFolder
Common Words
Word: world, Frequency: 3
Word: hello, Frequency: 3
*/