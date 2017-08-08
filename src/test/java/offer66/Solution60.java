package offer66;

/**
 * @author 范正荣
 * @Date 2017/8/4 0004 上午 10:43.
 * 二叉搜索树的第k个节点
 */
public class Solution60 {
    //二叉搜索树的中序遍历能够从小到大遍历所有节点，获取第k个
    int index = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot != null) {
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null)
                return node;

            index++;
            if (index == k)
                return pRoot;

            node = KthNode(pRoot.right, k);
            if (node != null)
                return node;
        }
        return null;
    }
}