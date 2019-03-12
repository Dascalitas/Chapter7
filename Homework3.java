package homeworkChapter7;

import java.util.Scanner;

public class Homework3 {

	public static final int INDEX(int number) {

		if (number > 1)
			return number;
		else
			return 10;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int index = 0;
		int number = input.nextInt();
		int[] array = new int[INDEX(number)];

		array[0] = number;
		for (int count = 1; count < array.length; count++) {
			array[count] = input.nextInt();
		}

		System.out.printf("%s%8s%n", "Index", "Value");

		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter + 1, array[counter]);
		}
	}
}


//7.15 (Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the
//first command-line argument. If no command-line argument is supplied, use 10 as the default size
//of the array.