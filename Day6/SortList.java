package Day6;

/*
Question 1

Sort the Collection
students are provided with a challenge to sort the given arraylist in the lesser lines of code.
Student with minimum lines will win , try to write a code for it in less lines and win

Input

An arraylist of integers

Output

Sorted list

Sample input

1
4
5
0

output

List before sort: [1, 4, 5, 0]
List after sort: [0, 1, 4, 5]
 */

 import java.util.*;

public class SortList {

    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 5, 0));
        System.out.println("List before sort: " + list);

        // Core Sorting Logic (Selection Sort)
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(j) < list.get(min)) min = j;
            
            if (min != i) {
                int temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }

        System.out.println("List after sort: " + list);
    }
    
}