package assignment;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Shufflegame {
	public static void main(String[] args) {


		int array[] = {1, 0, 1};
		char answer;
		int position;
		Scanner Sc = new Scanner(System.in);
		public int[] shuffleGame ( int[] ar){//{0, 1, 1}

			Random rnd = ThreadLocalRandom.current();

			for (int i = ar.length - 1; i > 0; i--) {

				int index = rnd.nextInt(i + 1);

				int a = ar[index];

				ar[index] = ar[i];

				ar[i] = a;

			}

			return ar;

		}


		public void playerGuess () {
			System.out.println("pick 1 or 2 or 3");
			while (!Sc.hasNextInt()) {
				System.out.println("pick 1 or 2 or 3");
				Sc.next();

			}

			position = Sc.nextInt();
			while (position != 1 && position != 2 && position != 3) {
				System.out.println("pick up 1 or 2 or 3");

				position = Sc.nextInt();
				if (answer == 1 || answer == 2 || answer == 3) {
					break;
				}

			}

		}
		public void checkGuess () {
			int array2[] = shuffleGame(array);
			if (array2[position - 1] == 0) {
				System.out.println("GOOD GUESS");
				for (int i = 0; i < array2.length; i++) {
					System.out.print(array2[i]);

				}
				System.out.println();
			} else {
				System.out.println("SORRY!! WRONG GUESS");
				for (int i = 0; i < array2.length; i++) {
					System.out.print(array2[i]);

				}
				System.out.println();
			}
		}

		public void play () {

			System.out.println("*****************WELCOME TO SHUFFLE GAME****************");
			System.out.println("GUESS WHERE THE 0 IS");
			do {
				System.out.println("ARE YOU READY TO PLAY? Y/N");

				answer = Sc.next().charAt(0);
				while (Character.toLowerCase(answer) != 'y' && Character.toLowerCase(answer) != 'n') {
					System.out.println("Enter Y or N");
					answer = Sc.next().charAt(0);
					if (Character.toLowerCase(answer) == 'y' || Character.toLowerCase(answer) == 'n') {
						break;
					}
				}
				if (Character.toLowerCase(answer) == 'y') {
					playerGuess();
					checkGuess();
				} else {
					break;
				}
				System.out.println("Do you want to try again?Y/N");
				answer = Sc.next().charAt(0);
				while (Character.toLowerCase(answer) != 'y' && Character.toLowerCase(answer) != 'n') {
					System.out.println("Enter Y or N");
					answer = Sc.next().charAt(0);
					if (Character.toLowerCase(answer) == 'y' || Character.toLowerCase(answer) == 'n') {
						break;
					}
				}
			} while (Character.toLowerCase(answer) == 'y');
			System.out.println("GOOD BYE, SEE YOU NEXT TIME");
		}

	}
}

