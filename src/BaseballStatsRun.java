import java.util.Scanner;

public class BaseballStatsRun {
	public static void main(String[] args) {
		double battingAver;
		double slugPer;
		Scanner scan = new Scanner(System.in);
System.out.println("Welcome to Batting Average Calculator!");

int[] atBatResult = new int[Stats.atBatSetter(scan)];
	for(int i = 0; i < atBatResult.length;i++) {
		System.out.print("Results for at-bat "+ (i+1) +": ");
			atBatResult[i]=scan.nextInt();
	}
	battingAver = Stats.batAverCalculator(Stats.hitCounter(atBatResult), atBatResult.length);
	slugPer = Stats.slugPerCalculator(Stats.baseCounter(atBatResult), atBatResult.length);
	System.out.println("Batting Average: " + battingAver);
	System.out.println("Slugging Percentage: " + slugPer);
	
	}
	
}
