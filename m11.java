class Solution {
    public boolean canAliceWin(int[] nums) {

        int single = 0;
        int doubleDigit = 0;

        for(int n : nums){

            if(n < 10)
                single += n;
            else
                doubleDigit += n;
        }

        return single != doubleDigit;
    }
} 
public class m11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 10, 20};
        boolean result = solution.canAliceWin(nums);
        System.out.println("Can Alice win? " + result);
    }
}