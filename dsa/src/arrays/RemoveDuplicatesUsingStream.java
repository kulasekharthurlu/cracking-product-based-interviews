package arrays;
import java.util.*;
import java.util.stream.*;

public class RemoveDuplicatesUsingStream {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        int[] result = Arrays.stream(arr)
                             .distinct()
                             .toArray();

        System.out.println(Arrays.toString(result));
    }
}