import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();

        int[][] numbers = new int[rows][column];

        System.out.println("Enter the elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the value of key: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (key == numbers[i][j]) {
                    System.out.println("Key found at index (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }
    }
}