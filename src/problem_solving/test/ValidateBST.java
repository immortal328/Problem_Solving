package problem_solving.test;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class ValidateBST {
    public static boolean isValidBSTs(TreeNode root) {
    	if(root == null)
    		return true; 
    	if((root.left != null && root.val <= root.left.val) || (root.right != null && root.val >= root.right.val))
    		return false;	
    	if(!isValidBSTs(root.left) || !isValidBSTs(root.right))
    		return false;
    	return true;    	
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println("Modified BTS Validations : " + isValidBSTs(root));
    }
}
