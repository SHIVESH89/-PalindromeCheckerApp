interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        // Strategy 1: Stack
        PalindromeStrategy stackStrategy = new StackStrategy();
        long startTime = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        long endTime = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + stackResult);
        System.out.println("Execution Time (Stack): " + (endTime - startTime) + " ns");

        System.out.println("-----------------------------------");

        // Strategy 2: Two-Pointer
        PalindromeStrategy twoPointerStrategy = new TwoPointerStrategy();
        startTime = System.nanoTime();
        boolean tpResult = twoPointerStrategy.check(input);
        endTime = System.nanoTime();

        System.out.println("Execution Time (Two-Pointer): " + (endTime - startTime) + " ns");
    }
}

