package Session_two.class_problems;

import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student record: ");
        String csvLine = sc.nextLine();

        String[] data = csvLine.split(",");

        if (data.length == 3) {
            System.out.println("Name: " + data[0]);
            System.out.println("Roll No: " + data[1]);
            System.out.println("Dept: " + data[2]);
        } else {
            System.out.println("Invalid Record");
        }
    }
}
