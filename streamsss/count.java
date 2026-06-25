package streamsss;

import java.util.Arrays;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("munna","omkar","siddhu","nani"); 

  

long countA = names.stream() 

    .filter(n -> n.startsWith("m")) 

    .count(); 

  

System.out.println(countA);
    }
}
