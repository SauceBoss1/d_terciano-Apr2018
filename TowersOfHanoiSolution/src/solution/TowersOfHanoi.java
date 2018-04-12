package solution;

import java.util.*;

public class TowersOfHanoi {
	public static String hanoiSol(int nDisks, int fromPeg, int toPeg) {
		if (nDisks == 1) {
			return fromPeg + " -> " + toPeg + ";";
		} else {
			String sol1, sol2, sol3;
			int helpPeg = 6 - fromPeg - toPeg;
			sol1 = hanoiSol(nDisks - 1, fromPeg, helpPeg);
			sol2 = fromPeg + " -> " + toPeg + ";";
			sol3 = hanoiSol(nDisks - 1, helpPeg, toPeg);
			return sol1 + sol2 + sol3;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many disks?: ");
		int answer = input.nextInt();
		String answerToSol = hanoiSol(answer, 1,3);
		
		for(String step:answerToSol.split(";")) {
			System.out.println(step);
		}
	}
}
