package programming.coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 Players a and b are playing the famous ball score game. 
 there are some balls placed on a table with each with a value on it. 
 game start with a coin toss. heads means a starts, else b starts. 
 winner takes first turn. during each turn a player is allowed to pick
 at most k balls from table. score is sum of values of all balls taken by player.
 b will only pick ball whose sum of digits of ball is maximum, 
 if theres a tie he chooses either one. a doesn't care about that he'll pick any ball. 
 both want to maximize their score so both will play optimally. 
 print the score both a and b will achieve.
 */

public class BallScoreGame {

	// Helper function to calculate the sum of digits of a number
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	// Main function to calculate scores for players A and B
	public static int[] gameScore(List<Integer> balls, int k) {
		// Sorting balls by sum of digits in descending order
		Collections.sort(balls, new Comparator<Integer>() {
			@Override
			public int compare(Integer ball1, Integer ball2) {
				int sum1 = sumOfDigits(ball1);
				int sum2 = sumOfDigits(ball2);
				if (sum1 != sum2) {
					return Integer.compare(sum2, sum1); // Descending order by sum of digits
				} else {
					return Integer.compare(ball2, ball1); // In case of tie, descending by value
				}
			}
		});

		int scoreA = 0;
		int scoreB = 0;
		boolean aTurn = true;

		while (!balls.isEmpty()) {
			if (aTurn) {
				// Player A's turn: pick any k balls
				int numPicked = Math.min(k, balls.size());
				for (int i = 0; i < numPicked; i++) {
					scoreA += balls.get(i);
				}
				balls.subList(0, numPicked).clear(); // Remove picked balls from list
				aTurn = false;
			} else {
				// Player B's turn: pick balls with max sum of digits, break ties randomly
				int maxSumOfDigits = sumOfDigits(balls.get(0));
				List<Integer> candidates = new ArrayList<>();

				// Collect all balls with the maximum sum of digits
				for (int ball : balls) {
					if (sumOfDigits(ball) == maxSumOfDigits) {
						candidates.add(ball);
					} else {
						break; // Since balls are sorted, we can stop early
					}
				}

				int numPicked = Math.min(k, candidates.size());
				for (int i = 0; i < numPicked; i++) {
					scoreB += candidates.get(i);
					balls.remove(Integer.valueOf(candidates.get(i))); // Remove picked ball from list
				}
				aTurn = true;
			}

			// Re-sort balls after each turn
			Collections.sort(balls, new Comparator<Integer>() {
				@Override
				public int compare(Integer ball1, Integer ball2) {
					int sum1 = sumOfDigits(ball1);
					int sum2 = sumOfDigits(ball2);
					if (sum1 != sum2) {
						return Integer.compare(sum2, sum1); // Descending order by sum of digits
					} else {
						return Integer.compare(ball2, ball1); // In case of tie, descending by value
					}
				}
			});
		}

		return new int[] { scoreA, scoreB };
	}

	public static void main(String[] args) {
		List<Integer> balls = new ArrayList<>();
		balls.add(12);
		balls.add(34);
		balls.add(56);
		balls.add(78);
		balls.add(91);
		balls.add(111);

		int k = 2;
		int[] scores = gameScore(balls, k);

		System.out.println("Score for player A: " + scores[0]);
		System.out.println("Score for player B: " + scores[1]);
	}
}
