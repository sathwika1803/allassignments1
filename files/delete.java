package files;
import java.io.*;

public class delete {
    public static void main(String[] args) {
        File f1=new File("Sathwika.txt");
        if(f1.exists()){
            if(f1.delete()){
                System.out.println("file deleted");
            }
            else{
                System.out.println("file does not delete");
            }
            
        }
        else{
               System.out.println("file does not exist"); 
            }
        
    }
}
