package javapatterns.patterns;

public class HollowDiamondWithSideStar {
	public static void print(int n) {
		// Uppermost line (full stars)
		for (int i = 0; i < 2 * n + 1; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Upper half
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 2 * n + 1; j++) {
				if (j < n - i || j >= n + i + 1) { // Condition for left and right stars
					System.out.print("*");
				} else {
					System.out.print(" "); // Inner spaces
				}
			}
			System.out.println();
		}

		// Middle line (single star at both ends)
		for (int j = 0; j < 2 * n + 1; j++) {
			if (j == 0 || j == 2 * n) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();

		// Lower half (mirrors the upper half)
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < 2 * n + 1; j++) {
				if (j < n - i || j >= n + i + 1) { // Condition for left and right stars
					System.out.print("*");
				} else {
					System.out.print(" "); // Inner spaces
				}
			}
			System.out.println();
		}

		// Bottommost line (full stars)
		for (int i = 0; i < 2 * n + 1; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		print(11);
	}
}

//public static void print(int n) {
//// Uppermost line (full stars)
//for (int i = 0; i < 2 * n + 1; i++) {
//	System.out.print("*");
//}
//System.out.println();
//
//// Upper half
//for (int i = 1; i < n; i++) {
//	// Left stars
//	for (int j = 0; j < n - i; j++) {
//		System.out.print("*");
//	}
//	// Inner spaces
//	for (int j = 0; j < 2 * i + 1; j++) {
//		System.out.print(" ");
//	}
//	// Right stars
//	for (int j = 0; j < n - i; j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
//
//// Middle line (single star in the center)
//System.out.print("*");
//for (int i = 0; i < 2 * n - 1; i++) {
//	System.out.print(" ");
//}
//System.out.println("*");
//
//// Lower half
//for (int i = n - 1; i > 0; i--) {
//	// Left stars
//	for (int j = 0; j < n - i; j++) {
//		System.out.print("*");
//	}
//	// Inner spaces
//	for (int j = 0; j < 2 * i + 1; j++) {
//		System.out.print(" ");
//	}
//	// Right stars
//	for (int j = 0; j < n - i; j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
//
//// Bottom most line (full stars)
//for (int i = 0; i < 2 * n + 1; i++) {
//	System.out.print("*");
//}
//System.out.println();
//}
