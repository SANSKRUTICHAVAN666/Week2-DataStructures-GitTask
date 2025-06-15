import java.util.Scanner;

public class NumberProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 different numbers
        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array
        sortArray(numbers);

        // Display sorted array
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Find second highest and second lowest
        System.out.println("\nSecond Lowest: " + findSecondLowest(numbers));
        System.out.println("Second Highest: " + findSecondHighest(numbers));
    }

    static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int findSecondLowest(int[] arr) {
        return arr[1]; // Array is sorted
    }

    static int findSecondHighest(int[] arr) {
        return arr[arr.length - 2]; // Array is sorted
    }
}

    

