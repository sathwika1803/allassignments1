package files;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        try{
        FileWriter f1=new FileWriter("Sathwika.txt");
        f1.write("sathwika is a good girl");
        f1.close();
        System.out.println("fileWritter is created");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
