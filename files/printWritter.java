package files;
import java.io.PrintWriter;
import java.io.IOException;


public class printWritter {
    public static void main(String[] args) {
        try{
        PrintWriter pw=new PrintWriter("Sathwika.txt");
        pw.println("Sathwika");
        pw.println("chinni");
        pw.close();
        System.out.println("ur data is saved");

        

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        
    }
}
