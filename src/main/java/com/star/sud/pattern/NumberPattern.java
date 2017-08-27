package com.star.sud.pattern;

public class NumberPattern {

	public static void pattern1(int line) {

		System.out.println("Pattern 1");

		for (int i = 1; i <= line; i++) {

			for (int j = 1; j <= line; j++) {

				System.out.print(j + " ");

			}

			System.out.println();
		}
		System.out.println("\n");
	}

	public static void pattern2(int line) {
		System.out.println("Pattern 2");
		for (int i = 1; i <= line; i++) {

			for (int j = line; j >= 1; j--) {

				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public static void pattern3(int line) {
		System.out.println("Pattern 3");
		for (int i = 1; i <= line; i++) {

			for (int j = 1; j <= line; j++) {

				System.out.print(i + " ");

			}

			System.out.println();
		}
		System.out.println("\n");

	}

	public static void pattern4(int line) {
		System.out.println("Pattern 4");

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();

		}

		System.out.println("\n");
	}

	public static void pattern5(int line) {
		System.out.println("Pattern 5");

		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");
			}
			System.out.println();

		}
		System.out.println("\n");
	}

	public static void pattern6(int line) {
		System.out.println("Pattern 6");

		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();

		}
		System.out.println("\n");
	}

	public static void pattern7(int line) {
		System.out.println("Pattern 7");

		int count = 1;
		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print(count + " ");
			}
			System.out.println();
			count++;

		}
		System.out.println("\n");
	}

}
