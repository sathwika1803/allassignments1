package files;
import java.io.File;


public class mkdir {
    public static void main(String[] args) {
        File f1=new File("sathwika");
        if(f1.mkdir()){
        System.out.println("Folder created successfully");
        }
        
        File f2=new File("chinni");
        if(f2.mkdir()){
        
        System.out.println("file created successfully");
        }
        if(f1.exists()&&f1.isDirectory()){
            System.out.println("file exist");
        }

    }
}
