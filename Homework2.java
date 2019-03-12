package homeworkChapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {

	public static long product(Integer... factors) {
		long produs = 1;
		for (int factor : factors) {
			produs *= factor;
		}
		return produs;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.printf("%s%n%s%n   %s%n   %s%n",

				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <Ctrl> D then press Enter", "On Windows type <Ctrl> Z then press Enter",
				"Enter number you want to increase :");

		while (input.hasNext()) {

			int number = input.nextInt();

			list.add(number);
			System.out.println("Enter your next numbers :");

		}
		Integer masiv[] = new Integer[list.size()];
		masiv = list.toArray(masiv);

		System.out.println("\nThe product of those numbers will be - " + product(masiv));

	}
}

//7.14 (Variable-Length Argument List) Write an application that calculates the product of a series
//of integers that are passed to method product using a variable-length argument list. 
//Test your method with several calls, each with a different number of arguments.
