package Session_two.class_problems;

import java.util.Scanner;

public class PhoneMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        boolean valid = true;

        if (phone.length() != 10) {
            valid = false;
        } else {
            for (int i = 0; i < phone.length(); i++) {
                if (!Character.isDigit(phone.charAt(i))) {
                    valid = false;
                    break;
                }
            }
        }

        if (valid) {
            String lastFour = phone.substring(6);

            StringBuilder result = new StringBuilder("XXXXXX");
            result.append("-").append(lastFour);

            System.out.println(result);
        } else {
            System.out.println("Invalid phone number");
        }
    }
}
