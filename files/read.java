package files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class read {
    public static void main(String[] args) {
        try{
            File f1=new File("Sathwika.txt");
           Scanner sc=new Scanner(f1);
           while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);

           }
           sc.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        
    }
}
