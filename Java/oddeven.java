import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String[] inputs = scanner.nextLine().split(" ");

        for (String input : inputs) {
            int num = Integer.parseInt(input);
            String result = (num % 2 == 0) ? "even" : "odd";
            System.out.println(num + "-" + result);
        }
    }
}