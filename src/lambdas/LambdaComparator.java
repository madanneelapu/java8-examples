package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(5);
        nums.add(8);
        nums.add(50);

        Collections.sort(nums, (a, b)-> a-b);
        System.out.println(nums);
    }
}
