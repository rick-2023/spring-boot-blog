package offer66;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 范正荣
 * @Date 2017/7/23 上午 10:34.
 */
public class IsBalancedTree {
    class TreeNode {
        TreeNode left;
        TreeNode right;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        return isBalancedTree(root, map);
    }

    private boolean isBalancedTree(TreeNode root, Map<TreeNode, Integer> map) {

        if (root == null)
            return true;

        if (root.left == null && root.right == null) {
            map.put(root, 1);
            return true;
        }
        int hl = 0;
        int hr = 0;
        if (root.left != null) {
            if (!isBalancedTree(root.left, map)) {
                return false;
            }
            hl = map.get(root.left);
        }
        if (root.right != null) {
            if (!isBalancedTree(root.right, map)) {
                return false;
            }
            hr = map.get(root.right);
        }

        int h = Math.max(hl,hr)+1;
        map.put(root,h);

        if(Math.abs(hl-hr)>1)
            return false;

        return true;
    }
}
