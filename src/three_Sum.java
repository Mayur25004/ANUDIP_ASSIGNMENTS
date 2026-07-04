import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<int<res>> = new ArrayList();

        for(int i=0; i<nums.length;i++){
            for(int j= i+1;j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){

                    if(nums[i]+nums[j]+nums[k]==0){
                        res.add(nums[i]+nums[j]+nums[k]);
                    }
                }
            }
        }
        return res;
    }
}