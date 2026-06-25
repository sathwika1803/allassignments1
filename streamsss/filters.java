package streamsss;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filters {
    public static void main(String[] args) {
        
    
    List<Integer> nums = Arrays.asList(6,2,8,1,3,1,0,2,0,0); 

  

List<Integer> evens = nums.stream() 

    .filter(n -> n % 4 == 0)   // keep only even numbers 

    .collect(Collectors.toList()); 
    

  

System.out.println(evens);
}
}


