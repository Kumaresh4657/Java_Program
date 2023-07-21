import java.util.Scanner;
public class strtonum {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with digits: ");
        String input = scanner.nextLine();

        String digits = input.replaceAll("[^0-9]", "");
        int number = Integer.parseInt(digits);

        System.out.println("Number extracted from string: " + number);
    }
}

