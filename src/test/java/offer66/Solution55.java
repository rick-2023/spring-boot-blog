package offer66;

/**
 * @author 范正荣
 * @Date 2017/8/1 0001 上午 10:10.
 *对称的二叉树
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution55 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return nodeIsSymmetrical(pRoot.left,pRoot.right);
    }

    private boolean nodeIsSymmetrical(TreeNode left, TreeNode right) {
        if (left == null)
            return right==null;

        if (right == null)
            return left==null;

        if (left.val != right.val)
            return false;

        return nodeIsSymmetrical(left.left,right.right) && nodeIsSymmetrical(left.right,right.left);

    }
}
