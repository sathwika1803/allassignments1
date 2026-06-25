package streamsss;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        
    
    List<String> names = Arrays.asList("Rathkanthi","Sathwika","Chinni","sweety"); 

  



List<String> upper = names.stream() 

    .map(name -> name.toUpperCase()) 
    

    .collect(Collectors.toList()); 

  

System.out.println(upper);
}
}


