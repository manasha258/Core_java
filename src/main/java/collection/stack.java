package collection;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> ss=new Stack<>();
        ss.push(1234);
        ss.push(3456);
        ss.push(4567);
        ss.push(8900);
        System.out.println("push value:"+ss);
        ss.pop();
        System.out.println("pop value:"+ss);
        System.out.println("peek valye:"+ss.peek()); //peek value means top value
        System.out.println("Empty value:"+ss.empty());
        System.out.println("Search value:"+ss.search(4567));
    }
}
