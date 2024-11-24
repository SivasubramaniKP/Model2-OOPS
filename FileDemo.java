import java.io.*;
import java.util.Scanner;
public class FileDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("story.txt");
        Scanner sc = new Scanner(file);
        String s="";
        while ( sc.hasNextLine() ) {
            String [] words = sc.nextLine().split(" ");
            for ( int i = 0; i < words.length; i++ ) {
                System.out.println(words[i]);
                s.concat(words[i]);
            }
        }
        System.out.println(s);
        sc.close();
        // FileWriter fw = new FileWriter(file);
        // String s = "1 2 3 4 5 6";
        // fw.write(s);
        // fw.close();
    }
}
