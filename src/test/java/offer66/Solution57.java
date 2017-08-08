package offer66;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 范正荣
 * @Date 2017/8/4 0004 上午 9:27.
 * 按层次打印二叉树
 */
public class Solution57 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null)
            return result;

        Queue<TreeNode> layerQueue = new LinkedList<>();
        ArrayList<Integer> layerList = new ArrayList<>();
        layerQueue.add(pRoot);
        int start = 0,end =1;
        while (!layerQueue.isEmpty()){
            TreeNode cur = layerQueue.remove();
            layerList.add(cur.val);
            start++;
            if (cur.left != null){
                layerQueue.add(cur.left);
            }
            if (cur.right != null){
                layerQueue.add(cur.right);
            }
            if (start == end){
                end = layerQueue.size();
                start =0;
                result.add(layerList);
                layerList = new ArrayList<>();
            }
        }
        return result;
    }
}
