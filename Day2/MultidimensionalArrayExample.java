package Day2;

/*
Question 2

Multidimensional Arrays in Java
Instructions:

Write a program that takes the row & columns input from the user to populate a 2D array and then prints the array.

Sample Input & Output:

Sample Input:
2
3
1 2 3
4 5 6

Sample Output:
1 2 3
4 5 6
Hints:
1. Use the Scanner class to read input from the user.
2. Create a nested for loop to iterate over the rows and columns of the array.
3. Use the nextInt() method of the Scanner class to read integer values from the user.
4. Store the input values in the array using the appropriate indices.
5. Print the array using a nested for loop.
 */

 import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        List<List<Integer>> nested = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                rowList.add(arr[i][j]);
            }
            nested.add(rowList);
        }

        for (List<Integer> row : nested) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
