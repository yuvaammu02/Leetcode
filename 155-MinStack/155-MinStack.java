// Last updated: 12/08/2026, 12:19:26
class MinStack {
    Stack<Integer> s ;
    Stack<Integer> minstack;

    public MinStack() {
        s = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(minstack.isEmpty() || value <= minstack.peek()){
            minstack.push(value);
        }
    }
    
    public void pop() {
        if(s.isEmpty()){
            return;
        }
       int x = s.pop();
       if(x == minstack.peek()){
        minstack.pop();
       }   
    }
    
    public int top() {
        return minstack.isEmpty() ? -1 : s.peek();
    }
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */