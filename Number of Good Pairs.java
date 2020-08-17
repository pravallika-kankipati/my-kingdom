/*
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:
Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

class Solution 
{
    public int numIdenticalPairs(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        
        int pairs=0;
        for(Map.Entry<Integer, Integer> ele : map.entrySet())
        {
            if(ele.getValue()>1)
            {
                int val = ele.getValue();
                while(val > 0)
                {
                    pairs += val-1;
                    val--;
                }
            }
        }
        
        return pairs;
    }
}