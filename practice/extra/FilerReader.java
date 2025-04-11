package practice.extra;
import java.io.*;

public class FilerReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Path : ");

        // Reading File name
        String path = br.readLine();
        FileReader fr=new FileReader(path);
//        FileReader fr = new FileReader("C:\\Users\\GaganaR\\IdeaProjects\\Training\\src\\Practice\\demo.txt");

        // Declaring loop variable
        int i;

        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)

            // Print all the content of a file
            System.out.print((char)i);
    }
}
