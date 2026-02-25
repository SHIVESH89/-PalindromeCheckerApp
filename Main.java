public class Main {
    String input = "madam";
    String reversed = "";
for (int i = input.length() - 1; i >= 0; i--) {
        reversed = reversed + input.charAt(i);
    }
    boolean result = input.equals(reversed);
}