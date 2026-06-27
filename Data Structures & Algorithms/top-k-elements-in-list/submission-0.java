class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num: nums) {
            count.put(num, 1 + count.getOrDefault(num, 0));
        }

        List<int[]> frequency = new ArrayList<>();
        count.forEach(
                (key, value) -> {
                    frequency.add(new int[] {value, key});
                }
        );
        frequency.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = frequency.get(i)[1];
        }

        return result;
    }
}