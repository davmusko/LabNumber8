import java.util.Scanner;

public class Stats {
	public static int atBatSetter(Scanner scan) {
		return getInt(scan, "Please enter the number of at bats: ");
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine();
		}
		return i;
	}

	public static int hitCounter(int[] array) {
		int hitCounter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				hitCounter++;
			}
		}
		return hitCounter;
	}

	public static int baseCounter(int[] array) {
		int basecounter = 0;
		for (int i = 0; i < array.length; i++) {
				basecounter += array[i];
		}
		return basecounter;
	}

	public static double batAverCalculator(int hits,int atBats) {
		return (hits/(double)atBats);
	}
	
	public static double slugPerCalculator(int bases, int atBats) {
		return (bases/(double)atBats);
	}

}