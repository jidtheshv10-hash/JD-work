class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for(int n : nums){
            ans ^= n;
        }

        return ans;
    }
}
public class m5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}