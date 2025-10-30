package Day2;

/*
 Question 3

Reverse each word in a string
Write a function to reverse each word in a string.

Description :-
A method has to be created that takes a string as input and extracts each word from that string 
and then reverse each word individually and gives the output as a reversed string. 

Example :-

Input:- great learning

output :- taerg gninrael

input :- hello guys how are you

output :- olleh syug woh era uoy



Explanations :- 
As the input string is great learning, each word has to be extracted i.e. great and learning 
then individually each word has to be reversed so it will be taerg and gninrael. 
After combining these two words into as single string the final output will be taerg gninrael.
 */

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1: ");
        String input1 = sc.nextLine();
        System.out.println("Output 1: " + reverseEachWord(input1));

        System.out.print("Input 2: ");
        String input2 = sc.nextLine();
        System.out.println("Output 2: " + reverseEachWord(input2));

        sc.close();
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}