// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
         //Way 1: can sort and check if previous element is diff from current
        // Time complexity O(nlogn)

        //Way 2: use hashset, keep adding, if already contains return true
        // Time O(n) Space O(n)

        HashSet<Integer> mySet = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(mySet.contains(nums[i])){
                return true;
            }
            mySet.add(nums[i]);
        }
        return false;
    }
}
