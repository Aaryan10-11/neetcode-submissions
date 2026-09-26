class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1; int zeroes=0;

        for(int num : nums){
            if(num!=0){
                product *= num;
            }
            else {
                zeroes ++;
            }
        }

        if(zeroes>1){
            return new int[nums.length];
        }

        int [] res =new int[nums.length];
        for(int i=0;i<res.length;i++){
            if(zeroes>0){
                if(nums[i]==0){
                    res[i]=product;
                }
                else{
                    res[i]=0;
                }
            }
            else{
                res[i]=product/nums[i];
            }
        }
        return res;
    }
}  
