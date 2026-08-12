// Last updated: 12/08/2026, 12:14:50
class MyQueue {
         Queue<Integer> queue;
    public MyQueue() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
         queue.add(x);
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty() ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */