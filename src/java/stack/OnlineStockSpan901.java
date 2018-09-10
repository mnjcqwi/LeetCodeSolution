package java.stack;

import java.util.Stack;
//使用单调递减stack，区别是保留一个数组
public class OnlineStockSpan901 {
    Stack<int[]> stack;

    public OnlineStockSpan901() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int result = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            result += stack.pop()[1];
        }
        stack.push(new int[]{price, result});
        return result;
    }
}

