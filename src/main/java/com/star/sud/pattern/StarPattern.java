package com.star.sud.pattern;

public class StarPattern {

	public static void pattern1(int line) {
		System.out.println("Pattern 1");

		for (int i = 0; i < line; i++) {

			for (int j = 0; j < line; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static void pattern2(int line) {
		System.out.println("Pattern 2");

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public static void pattern3(int line) {
		System.out.println("Pattern 3");

		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println("\n");
	}

	public static void pattern4(int line) {
		System.out.println("Pattern 4");

		int star = 1;
		int mid = (line + 1) / 2;

		for (int i = 1; i < line; i++) {

			for (int j = 1; j <= star; j++) {
				System.out.print("*");

			}

			if (i < mid)
				star++;

			else
				star--;
			System.out.println();
		}
		System.out.println("\n");

	}

	public static void pattern5(int line) {
		System.out.println("Pattern 5");

		int star = 1;
		int space = line - 1;

		for (int i = 1; i <= line; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");

			}
			star++;
			space--;

			System.out.println();
		}
		System.out.println("\n");

	}

	public static void pattern6(int line) {
		System.out.println("Pattern 6");

		int star = 1;
		int mid = (line + 1) / 2;
		int space = mid - 1;

		for (int i = 1; i <= line; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");

			}
			if (i < mid) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}

			System.out.println();
		}

		System.out.println("\n");

	}

	public static void pattern7(int line) {
		System.out.println("Pattern 7");

		int star = 1;
		int mid = (line + 1) / 2;
		int space = mid - 1;

		for (int i = 1; i <= line; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("* ");

			}
			if (i < mid) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}

			System.out.println();
		}
		System.out.println("\n");

	}

	public static void pattern8(int line) {
		System.out.println("Pattern 8");

		int star = 1;
		int mid = (line + 1) / 2;
		int space = mid - 1;

		for (int i = 1; i <= line; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");

			}
			if (i < mid) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}

			System.out.println();
		}
		System.out.println("\n");
	}

}
