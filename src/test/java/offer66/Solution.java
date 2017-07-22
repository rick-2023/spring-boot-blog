package offer66;

import java.util.Stack;

/**
 * Created by Administrator on 2017/5/29 0029.
 */
public class Solution {

        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public Solution(){
            this.stackData = new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }

        public void push(int node) {
            if(this.stackMin.isEmpty()){
                this.stackMin.push(node);
            }else if (node<=this.min()){
                this.stackMin.push(node);
            }
            this.stackData.push(node);
        }

        public void pop() {

        }

        public int top() {
            if(this.stackData.isEmpty()){
                throw new RuntimeException("the stackData is Empty");
            }
            int value = this.stackData.pop();
            if(value == this.min()) {
                return this.stackMin.pop();
            }
            return value;
        }


        public int min() {
            if(this.stackMin.isEmpty()){
                throw new RuntimeException("the stackMin is Empty");
            }
            return this.stackMin.peek();
        }
    }
