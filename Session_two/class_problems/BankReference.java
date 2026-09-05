package Session_two.class_problems;
import java.util.Scanner;

public class BankReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter reference code: ");
        String raw = sc.nextLine();

        String reference = raw.trim();

        if (reference.length() >= 3) {
            reference = reference.substring(0, 3).toUpperCase()
                    + reference.substring(3);
        }

        if (reference.length() != 14) {
            System.out.println("Invalid: wrong length");
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                System.out.println("Invalid: bank code must be 3 letters");
                return;
            }
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                System.out.println("Invalid: body must contain digits");
                return;
            }
        }

        String bankCode = reference.substring(0, 3);
        String date = reference.substring(3, 9);
        String sequence = reference.substring(9, 14);

        String formattedDate = date.substring(0, 2) + "/"
                + date.substring(2, 4) + "/"
                + date.substring(4, 6);

        StringBuilder result = new StringBuilder();

        result.append("[")
              .append(bankCode)
              .append("] DATE: ")
              .append(formattedDate)
              .append(" | SEQ: ")
              .append(sequence);

        System.out.println(result);
    }
}
