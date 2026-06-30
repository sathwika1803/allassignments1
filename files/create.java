package files;
import java.io.IOException;
import java.io.File;

public class create {
    public static void main(String[] args) {
        File f1=new File("Sathwika.txt");
        try{
            if(f1.createNewFile()){
                System.out.println("new file:"+f1.getName());
            }
            else{
                System.out.println("file already existtt");
            }
        }
            catch(IOException e){
                e.printStackTrace();
            }
        
    }
}
