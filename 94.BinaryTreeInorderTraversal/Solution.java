

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> answer = new ArrayList<>();

        inorderHelper(root, answer);
        return answer;
    }
    
    private void inorderHelper(TreeNode node, List<Integer> answer) {

        if (node == null) {
            return;
        }
        inorderHelper(node.left, answer);
        answer.add(node.val);
        
        inorderHelper(node.right, answer);
    }
}

    