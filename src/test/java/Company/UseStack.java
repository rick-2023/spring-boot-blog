package Company;

import java.util.Stack;

/**
 * @author 范正荣
 * @Date 2017/8/15 0015 上午 10:03.
 */
public class UseStack {
        public static void main(String[] args) {
            Stack<Integer> stack= new Stack<Integer>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            reverse(stack);
            while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }
        }
        public static int getAndRemoveLastElement(Stack<Integer> stack){
            int result = stack.pop();
            if(stack.isEmpty()){
                return result;
            }else{
                int last=getAndRemoveLastElement(stack);
                stack.push(result);
                return last;
            }
        }

        public static void reverse(Stack<Integer> stack){
            if(stack.isEmpty()){
                return ;
            }
            int i = getAndRemoveLastElement(stack);
            reverse(stack);
            stack.push(i);
        }
    }


