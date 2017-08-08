package offer66;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author 范正荣
 * @Date 2017/8/1 0001 上午 10:39.
 */

public class Solution56 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int layer = 1;
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(pRoot);
        Stack<TreeNode> s2 = new Stack<>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        while (!s1.empty() || !s2.empty()){
            if (layer%2 != 0){//奇数层
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.empty()){
                    TreeNode node = s1.pop();
                    if (node!=null){
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()){
                    list.add(temp);
                    layer++;
                }
            }else{//偶数层
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.empty()){
                    TreeNode node = s2.pop();
                    if (node != null){
                        temp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()){
                    list.add(temp);
                    layer++;
                }
            }
        }
    return list;
    }
}
