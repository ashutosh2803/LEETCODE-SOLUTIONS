class Solution {

    int maxDiameter = 0;

    public int dfs(TreeNode node) {
        if(node == null) return 0;

        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);
        maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

        return Math.max(leftDepth , rightDepth) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        
        dfs(root);
        return maxDiameter;
    }
}