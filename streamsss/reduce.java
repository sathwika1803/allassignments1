package streamsss;


import java.util.Arrays;
import java.util.List;

public class reduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(0,3,0,5,2,0,0,5); 

  

// Sum all numbers 

int sum = nums.stream() 

    .reduce(0, (a, b) -> a + b); 

System.out.println(sum);
    }
}


