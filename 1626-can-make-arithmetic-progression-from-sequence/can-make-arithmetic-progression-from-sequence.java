class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order
        
        int diff = arr[1] - arr[0]; // Calculate the initial difference
        
        // Check if the difference between any two consecutive elements is the same
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false; // Difference is not the same, array cannot form an arithmetic progression
            }
        }
        
        return true; // All differences are the same, array can form an arithmetic progression
    }
}