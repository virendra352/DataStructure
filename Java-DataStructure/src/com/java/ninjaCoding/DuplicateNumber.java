package com.java.ninjaCoding;

class DuplicateNumber {
    public static void main(String[] args) {
        int[] ar={1,2,3,3,4};
        System.out.println(findDuplicate(ar));
    }
    public static int findDuplicate(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    duplicate=true;
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
