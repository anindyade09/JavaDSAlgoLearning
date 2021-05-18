package ad.arrays;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * 
 * Given an array nums. We define a running sum of an array as runningSum[i] =
 * sum(nums[0]…nums[i]). Return the running sum of nums.
 * 
 * Example 1: Input: nums = [1,2,3,4] Output: [1,3,6,10] Explanation: Running
 * sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * Example 2: Input: nums = [1,1,1,1,1] Output: [1,2,3,4,5] Explanation: Running
 * sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * 
 */

public class RunningSum1DArray {
	
	public static int[] runningSum(int[] nums) {
        //Initialize runningSumSolution of the length same as input int[]
        int[] runningSumSolution = new int[nums.length];
        
        //Iterate over the input array and calculate the runningSum and update the runningSumSolution[]
        int runningSum = 0;
        for(int i = 0; i < nums.length; i++){
            runningSum = runningSum + nums[i];
            runningSumSolution[i] = runningSum;
        }
        
        return runningSumSolution;
    }
}

/* Sample Run 1:
i   nums[i]     runningSum      runningSumSolution
                0               [0, 0, 0, 0]
0   1           1               [1, 0, 0, 0]
1   2           3               [1, 3, 0, 0]
2   3           6               [1, 3, 6, 0]
3   4           10              [1, 3, 6, 10]
*/
