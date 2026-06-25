package streamsss;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sort {
    public static void main(String[] args) {
    

    List<Integer> nums = Arrays.asList(9,8,4,9,0,2,8,1,7,9); 

  



List<Integer> asc = nums.stream().sorted().collect(Collectors.toList()); 
System.out.println(asc);
}
}


