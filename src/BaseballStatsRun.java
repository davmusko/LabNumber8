import java.util.Scanner;

public class BaseballStatsRun {
	public static void main(String[] args) {
		double battingAver;
		double slugPer;
		boolean done = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Batting Average Calculator!");
		do {
			int[] atBatResult = new int[Stats.atBatSetter(scan)];
			for (int i = 0; i < atBatResult.length; i++) {
				System.out.print("Results for at-bat " + (i + 1) + ": ");
				atBatResult[i] = scan.nextInt();
			}
			battingAver = Stats.batAverCalculator(Stats.hitCounter(atBatResult), atBatResult.length);
			slugPer = Stats.slugPerCalculator(Stats.baseCounter(atBatResult), atBatResult.length);

			System.out.printf("Batting Average: %.3f\n", battingAver);
			System.out.printf("Slugging Percentage: %.3f\n", slugPer);
			System.out.println("Another batter? (y/n): ");
			scan.nextLine();
			done = !scan.nextLine().equalsIgnoreCase("y");
		} while (!done);
		System.out.print("GoodBye");
	}
}
