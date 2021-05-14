import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i );
        }
        for (int i = 0; i < nums.length/2; i++) {
            if(map.get(target-nums[i])!=null){
		System.out.println("["+i+","+map.get(target-nums[i])+"]");
                
            }
        }
        return null;
    }
}
public class TwoSum2{
	public static void main(String args[]){
		Solution solution = new Solution();
		int [] nums={1,2,4,5,6,7,8,9};
		solution.twoSum(nums,10);
	}
}
