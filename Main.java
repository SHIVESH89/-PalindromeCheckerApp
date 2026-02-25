public class Main {
    String input = "noon";
    Stack<Character> stack = new Stack<>();
for (char c : input.toCharArray()) stack.push(c);
    boolean isPalindrome = true;
for (char c : input.toCharArray()) {
        if (c != stack.pop()) { isPalindrome = false; break; }
    }
}