
import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){

            if(set.contains(n))
                return n;

            set.add(n);
        }

        return -1;
    }
}
public class m10 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,3, 3, 4, 2, 2};
        int result = solution.findDuplicate(nums);
        System.out.println("The duplicate number is: " + result);
    }
}