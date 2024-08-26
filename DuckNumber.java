import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck number.");
        } else {
            System.out.println(number + " is not a Duck number.");
        }

        scanner.close();
    }

    public static boolean isDuckNumber(String number) {
        if (number.charAt(0) == '0') {
            return false;
        }
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }
}
