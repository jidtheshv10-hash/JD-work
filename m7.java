class Solution {
    public int arraySign(int[] nums) {

        int sign = 1;

        for(int n : nums){

            if(n == 0)
                return 0;

            if(n < 0)
                sign *= -1;
        }

        return sign;
    }
}
public class m7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1, -2, -3, 4};
        int result = solution.arraySign(nums);
        System.out.println("The sign of the product is: " + result);
    }
}