package files;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;


public class bufferReader {
    public static void main(String[] args) {
        try{
        FileReader f1=new FileReader("Sathwika.txt");
        BufferedReader b1=new BufferedReader(f1);
        String line;
        while((line=b1.readLine())!=null){
            System.out.println(line);
        }
        b1.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
