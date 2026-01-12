package org.jan09.readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class readFile {
    public static void main(String[]args) throws FileNotFoundException {
        readFile1 rf = new readFile1();
        System.out.println(rf.readFile());
        rf.readFile();
    }
}

class readFile1{
    public String readFile() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Honey\\IdeaProjects\\Java Learning\\src\\main\\java\\org\\jan09\\readFile\\abc.txt"));
        String everything = null;
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return everything;
    };
}
