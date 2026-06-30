package files;
import java.io.FileWriter;
import java.io.IOException;

public class filewriterAppend {
    public static void main(String[] args) {
        try(FileWriter f1=new FileWriter("chinni.txt",true)){
            f1.write("\nchinni reads welllll");
            f1.close();
            System.out.println("FileWriter created");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
