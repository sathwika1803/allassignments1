package files;
import java.io.File;

public class exist {
    public static void main(String[] args) {
        File f1=new File("Sathwika.txt");
        if(f1.exists()){
            System.out.println(f1.getName());
            System.out.println(f1.getAbsolutePath());

        }else{
            System.out.println("file does not exist");
        }
    }
}
