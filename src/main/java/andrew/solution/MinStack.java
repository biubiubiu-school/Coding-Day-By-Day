package andrew.solution;

import java.util.ArrayList;

/**
 * @author Andrew Tse
 * @date 2019-06-14
 *
 * LeetCode：https://leetcode-cn.com/explore/interview/card/top-interview-quesitons-in-2018/266/heap-stack-queue/1153/
 * 最小栈:设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 */
public class MinStack {

    private ArrayList<Integer> mArrayList;
    private ArrayList<Integer> mMinStack;
    private int mSize = 0;

    public MinStack() {
        mArrayList = new ArrayList<>();
        mMinStack = new ArrayList<>();
    }

    public void push(int x) {
        if (mSize == 0) {
            mMinStack.add(x);
        } else {
            int min = mMinStack.get(mSize - 1);
            if (min <= x) {
                mMinStack.add(min);
            } else {
                mMinStack.add(x);
            }
        }
        mArrayList.add(x);
        mSize++;
    }

    public void pop() {
        if (mSize == 0) {
            return;
        }
        mSize--;
        mArrayList.remove(mSize);
        mMinStack.remove(mSize);
    }

    public int top() {
        return mArrayList.get(mSize - 1);
    }

    public int getMin() {
        return mMinStack.get(mSize - 1);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
