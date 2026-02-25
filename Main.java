public class Main {
    LinkedList<Character> list = new LinkedList<>();
for (char c : "level".toCharArray()) list.add(c);
while (list.size() > 1) {
        if (list.removeFirst() != list.removeLast()) { isPalindrome = false; break; }
    }
}