import java.util.Scanner;

public class RepeatInString {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first String");
        String firstString = scanner.nextLine();
        System.out.println("Enter second String");
        String secondString = scanner.nextLine();
        System.out.println(StringInString(firstString, secondString));
    }

    public static int StringInString(String one, String two) {
        if (one == null || two == null)
            return 0;
        if (one.length() == 0 || two.length() == 0)
            return 0;
        int count = 0;
        for (int i = 0; i <= one.length() - two.length(); i++) {
            String sub = one.substring(i, i + two.length());
            if (sub.equals(two)) {
                count = count + 1;
            }
        }
        return count;
    }
}
