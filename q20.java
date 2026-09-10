import java.util.Stack;

class Solution {
    boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char s0 = s.charAt(0);
        
        if (s.length() % 2 == 1 || s0 == ')' || s0 == ']' || s0 == '}') {
            return false;
        }
        
        char popped;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                
                popped = stack.pop();
                
                if (c == ')' && popped == '(') {
                    continue;
                } else if (c == ']' && popped == '[') {
                    continue;
                } else if (c == '}' && popped == '{') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
