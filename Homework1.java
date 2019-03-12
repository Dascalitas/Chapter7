package homeworkChapter7;

import java.util.Scanner;

public class Homework1 {

	public static boolean check(int[] array, int number) {
		for (int num : array) {
			if (num == number)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list = new int[5];

		System.out.println("Hy. Try to enter 5 number for 10 to 100 without duplicates.");

		for (int counter = 0; counter < list.length; counter ++) {

			int num = input.nextInt();

			if (num > 9 && num < 101) {

				if (check(list, num)) {
					list[counter] = num;
					System.out.println("Good. Now enter next number.");
				} 
				
				else {
					System.out.println("This number already exist.");
				}
			} 
			else
				System.out.println("you enter wrong number");
		}

		System.out.println("\nvalue");
		for (int count : list) {
			if (count != 0)
				System.out.println(count);
		}
	}

}
// list = 12 13 14 16 17
//7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
//is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
//in which all five numbers are different. Use the smallest possible array to solve this problem. Display
//the complete set of unique values input after the user enters each new value.