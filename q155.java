class MinStack {
  int[][] stack = new int[30000][2];
  int min;
  int top;
  public MinStack() {
    this.top = -1;
  }
  
  public void push(int value) {
    this.top += 1;
    stack[top][0] = value;
    if(top == 0){
      this.min = value;
      stack[top][1] = this.min;
      return;
    }
    if(value<this.min){
      this.min = value;
      stack[top][1] = this.min;
      return;
    }
    stack[top][1] = this.min;
    return;
  }
  
  public void pop() {
    if(this.min == stack[top][0] && top != 0){
      this.min = stack[top-1][1];
    }
    this.top -= 1;
    return;
  }
  
  public int top() { 
    return stack[this.top][0];
  }
  
  public int getMin() {
    return stack[top][1];
      
  }
}


