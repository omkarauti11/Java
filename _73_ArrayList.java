import java.util.ArrayList;
import java.util.List;

public class _73_ArrayList {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        // System.out.println(nums.get(2));

        // System.out.println(nums.indexOf(2));

        for (int n : nums) {
            System.out.println(n);
        }

    }
}
