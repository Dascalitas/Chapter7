package homeworkChapter7;

import java.security.SecureRandom;

public class Homework5 {

	public static int random() {

		SecureRandom randomNumbers = new SecureRandom();
		int random = 1 + randomNumbers.nextInt(6);

		return random;
	}

	public static void main(String[] args) {

		int[] array = new int[11];

		for (int roll = 0; roll < 36000000; roll++) {
			int dice1 = random();
			int dice2 = random();

			++array[(dice1 + dice2) - 2];

		}
		for (int ark = 0; ark < array.length; ark++) {
			System.out.printf("%4d%10d%n", ark + 2, array[ark]);

		}
	}

}


//7.17	(Dice Rolling) Write an application to simulate the rolling of two dice. The application
//should use an object of class Random once to roll the first die and again to roll the second die. The
//sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
//the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
//least frequent. Figure 7.28 shows the 36 possible combinations of the two dice. Your application
//should roll the dice 36,000,000 times. Use a one-dimensional array to tally the number of times
//each possible sum appears. Display the results in tabular format.