class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }

    public int sum(TreeNode root) {
        if (root == null)
            return 0;
        int leftSum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftSum += root.left.val;
        }
        int leftSubtreeSum = sum(root.left);
        int rightSubtreeSum = sum(root.right);
        return leftSum + leftSubtreeSum + rightSubtreeSum;
    }}