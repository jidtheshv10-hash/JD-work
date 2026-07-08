 
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int total = n * (n + 1) / 2;

        int sum = 0;

        for(int num : nums)
            sum += num;

        return total - sum;
    }
}
public class m6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1};
        int result = solution.missingNumber(nums);
        System.out.println("The missing number is: " + result);
    }
}