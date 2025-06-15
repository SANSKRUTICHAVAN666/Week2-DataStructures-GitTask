import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age;
        while (true) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0) break;
                else System.out.print("Age cannot be negative. Enter again: ");
            } else {
                System.out.print("Invalid input. Enter a valid age: ");
                scanner.next(); // clear invalid input
            }
        }

        scanner.nextLine(); // consume the newline left by nextInt()

        System.out.print("Enter your profession: ");
        String profession = scanner.nextLine();

        // Print summary
        System.out.println("\n--- User Information Summary ---");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Profession : " + profession);

        // Conditional logic
        if (age >= 13 && age <= 19) {
            System.out.println("You’re a teenager!");
        } else if (age < 13) {
            System.out.println("You’re a child.");
        } else if (age >= 20 && age <= 60) {
            System.out.println("You’re an adult.");
        } else {
            System.out.println("You’re a senior citizen.");
        }

        scanner.close();
    }
}
