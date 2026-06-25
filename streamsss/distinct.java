package streamsss;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class distinct {
    public static void main(String[] args) {
        
    
    List<Integer> nums = Arrays.asList(9,0,3,2,9,1,2,1,1,1); 

  

List<Integer> unique = nums.stream() 

    .distinct() 
    .sorted(Comparator.reverseOrder())

    .collect(Collectors.toList()); 

  

System.out.println(unique);
}
}


