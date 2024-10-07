import java.util.Stack;

class Solution {
    public int minLength(String s) {
        int length = 0;
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            switch(c) {
                case 'A', 'C' -> characters.push(c);
                case 'B' -> {
                    if (characters.isEmpty()) length++;
                    else if (characters.pop() != 'A') {
                        length += 2 + characters.size();
                        characters.clear();
                    }
                }
                case 'D' -> {
                    if (characters.isEmpty()) length++;
                    else if (characters.pop() != 'C') {
                        length += 2 + characters.size();
                        characters.clear();
                    }
                }
                default -> {
                    length += characters.size() + 1;
                    characters.clear();
                }
            }
        }
        return length + characters.size();
    }
}