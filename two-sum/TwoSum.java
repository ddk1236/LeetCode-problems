class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            for(int j=1;j<(nums.length/2);j++){
                int b=nums[j];
                if((a+b)==target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
	return null;
    }
}
public class TwoSum{
	public static void main(String args[]){
		Solution1 solution = new Solution1();
		int [] nums={1,2,4,5,6,7,8,9};
		solution.twoSum(nums,10);
	}
}
