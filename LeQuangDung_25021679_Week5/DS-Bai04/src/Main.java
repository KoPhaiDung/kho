import java.util.*;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        WordCounter.analize(input);
        WordCounter.displayResult();
    }
}