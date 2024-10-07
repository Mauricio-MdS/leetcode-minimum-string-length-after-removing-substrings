import java.util.Stack;

class Solution {
    public int minLength(String s) {
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!characters.isEmpty() && (
                            (c == 'B' && characters.peek() == 'A') || (c == 'D' && characters.peek() == 'C'))
            ) characters.pop();
            else characters.push(c);
        }
        return characters.size();
    }
}