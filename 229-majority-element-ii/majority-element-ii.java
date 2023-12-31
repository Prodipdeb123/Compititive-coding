class Solution {
    public List<Integer> majorityElement(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > nums.length / 3)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }
}