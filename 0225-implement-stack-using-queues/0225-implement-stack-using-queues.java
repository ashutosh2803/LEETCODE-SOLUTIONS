class MyStack {
    ArrayDeque<Integer> q;
    public MyStack() {
        q=new ArrayDeque<>();        
    }
    public void push(int x) {
        q.push(x);        
    }
    
    public int pop() {
        return q.remove();
    }
    public int top() {
        return q.peekFirst();
    }
    public boolean empty() {
        return q.isEmpty(); 
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */