public class Main {
    String input = "civic";
    Queue<Character> queue = new LinkedList<>();
    Stack<Character> stack = new Stack<>();
for (char c : input.toCharArray()) { queue.add(c); stack.push(c); }
while (!queue.isEmpty()) {
        if (queue.poll() != stack.pop()) { isPalindrome = false; break; }
    }
}