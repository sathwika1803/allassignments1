package files;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class bufferWriter {
    public static void main(String[] args) {
        try{
        FileWriter fw=new FileWriter("Sathwika.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("sathwika");
        bw.newLine();
        bw.write("chinni");
         bw.newLine();
        bw.write("sweety");
         bw.newLine();
         bw.close();
         System.out.println("your data is savedccessfully");

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
