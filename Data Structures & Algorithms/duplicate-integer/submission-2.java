class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num: nums) {
            numsSet.add(num);
        }
        if (nums.length == numsSet.size()) {
            return false;
        } else {
            return true;
        }
    }
}