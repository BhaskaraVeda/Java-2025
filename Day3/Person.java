package Day3;

/*
 Question 1

Classes & Objects in Java

Instructions:

Write a program that takes input from the user and creates an object of a class named 'Person'.
 The 'Person' class should have two member variables: 'name' and 'age'. 
 The program should prompt the user to enter their name and age, create a 'Person' object 
 with the entered values, and then display the name and age of the person.

Sample Input & Output:

Sample Input:
John
25

Sample Output:
Name: John
Age: 25
Hints:
1. Use the 'Scanner' class to read input from the user.
2. Create a class named 'Person' with two member variables: 'name' and 'age'.
3. Use the 'new' keyword to create an object of the 'Person' class.
4. Use the dot operator to access the member variables of the 'Person' object.
5. Print the name and age of the person using the 'System.out.println()' method.
 */


 import java.util.Scanner;

public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        // Fix: Use System.in in the Scanner constructor
        Scanner sc = new Scanner(System.in);

        String personName = sc.nextLine();
        
        int personAge = sc.nextInt(); 

        Person personObject = new Person();
        
        personObject.name = personName;
        personObject.age = personAge;

        System.out.println("Name: " + personObject.name);
        System.out.println("Age: " + personObject.age);

        sc.close();
    }
}
