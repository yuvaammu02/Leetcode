// Last updated: 14/08/2026, 13:59:43
1class MinStack {
2    Stack<Integer> s ;
3    Stack<Integer> minstack;
4
5    public MinStack() {
6        s = new Stack<>();
7        minstack = new Stack<>();
8    }
9    
10    public void push(int value) {
11        s.push(value);
12        if(minstack.isEmpty() || value <= minstack.peek()){
13            minstack.push(value);
14        }
15    }
16    
17    public void pop() {
18        if(s.isEmpty()){
19            return;
20        }
21       int x = s.pop();
22       if(x == minstack.peek()){
23        minstack.pop();
24       }   
25    }
26    
27    public int top() {
28        return minstack.isEmpty() ? -1 : s.peek();
29    }
30    public int getMin() {
31        return minstack.peek();
32    }
33}
34
35/**
36 * Your MinStack object will be instantiated and called as such:
37 * MinStack obj = new MinStack();
38 * obj.push(value);
39 * obj.pop();
40 * int param_3 = obj.top();
41 * int param_4 = obj.getMin();
42 */