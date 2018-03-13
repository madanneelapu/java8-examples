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


        /*Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });*/
        //Collections.sort(nums, (a, b)-> a-b);
        Collections.sort(nums, Integer::compare);

        System.out.println(nums);
    }
}
