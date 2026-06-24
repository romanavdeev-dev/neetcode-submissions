class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num: nums) {
            if (numsSet.contains(num)) {
                return true;
            } else {
                numsSet.add(num);
            }
        }
        return false;
    }
}