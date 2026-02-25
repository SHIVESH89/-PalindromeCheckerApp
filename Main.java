public class Main {
    String input = "refer";
    Deque<Character> deque = new ArrayDeque<>();
for (char c : input.toCharArray()) deque.addLast(c);
while (deque.size() > 1) {
        if (deque.removeFirst() != deque.removeLast()) { isPalindrome = false; break; }
    }
}