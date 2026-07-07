package leet;

class Solution {
    public int averageValue(int[] nums) {

        int sum = 0;
        int count = 0;

        for(int n : nums){
            if(n % 2 == 0 && n % 3 == 0){
                sum += n;
                count++;
            }
        }

        if(count == 0)
            return 0;

        return sum / count;
    }
}

public class m2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 6, 10, 12};
        int result = solution.averageValue(nums);
        System.out.println("Average value of even numbers divisible by 3: " + result);
    }
}   