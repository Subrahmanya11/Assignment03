package in.ineuron.main;

import java.util.Random;
import java.util.Scanner;

class MagicalGuess {
	static Random Rm = new Random();
	static int MagicalNo = Rm.nextInt(11);
}

class Nitin {
	boolean flag = false;
	int count = 1;

	int NitinNo() {
		
		System.out.println("\nNitin kindly guess the number with your compiler & Jvm level of thinking: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		MagicalGuess g1 = new MagicalGuess();

		if (n1 >= 0 && n1 <= 10) {

			System.out.println("Here you go: Best of Luck Nitin ");

			L1: {
				if (n1 == g1.MagicalNo) {
					System.out.println("Nitin You Guessed the  Magical number " + g1.MagicalNo + " in " + count + " guess");
					System.out.println();
					flag = true;
					break L1;
				} else

				if (n1 > g1.MagicalNo)
					System.out.println("You Guessed Higher.\nHint:  Guess the number below " + n1 + " to win");
				if (n1 < g1.MagicalNo)
					System.out.println("You Guessed Lower.\nHint:  Guess the number above " + n1 + " to win");
				System.out.println("count: " + count++);
				System.out.println();
				// System.out.println("Magical No " + g1.MagicalNo);

				if (count <= 5)
					NitinNo();
				else {
					System.out.println("Nitin your Guesses Over\n");
					System.out.println();
				}
			}
		} else {
			System.out.println("Enter btwn 0 to 10");
			System.out.println("count: " + count++);
			System.out.println();
			// System.out.println("Magical No " + g1.MagicalNo);
			if (count <= 5)
				NitinNo();
			else {
				System.out.println("Nitin your Guesses Over\n ");
				System.out.println();
			}
		}

		return count;

	}

}

class Hyder {
	boolean flag = false;
	int count = 1;

	int HyderNo() {
		
		System.out.println("\nHyder kindly guess the number with maximum FOCUS");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		MagicalGuess g1 = new MagicalGuess();

		if (n1 >= 0 && n1 <= 10) {

			System.out.println("Here you go: Best of Luck Hyder ");

			L1: {
				if (n1 == g1.MagicalNo) {
					System.out.println("Hyder You Guessed the  Magical number " + g1.MagicalNo + " in " + count + " guess");
					System.out.println();
					flag = true;
					break L1;
				} else

				if (n1 > g1.MagicalNo)
					System.out.println("You Guessed Higher.\nHint:  Guess the number below " + n1 + " to win");
				if (n1 < g1.MagicalNo)
					System.out.println("You Guessed Lower.\nHint:  Guess the number above " + n1 + " to win");
				System.out.println("count: " + count++);
				System.out.println();
				// System.out.println("Magical No " + g1.MagicalNo);

				if (count <= 5)
					HyderNo();
				else {
					System.out.println("Hyder your Guesses Over\n");
				}
			}
		} else {
			System.out.println("Enter btwn 0 to 10");
			System.out.println("count: " + count++);
			System.out.println();
			// System.out.println("Magical No " + g1.MagicalNo);
			if (count <= 5)
				HyderNo();
			else {
				System.out.println("Hyder your Guesses Over\n");
			}
		}

		return count;

	}

}

class Navin {
	boolean flag = false;
	int count = 1;

	int NavinNo() {
		
		System.out.println("\nNavin kindly guess the number");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		MagicalGuess g1 = new MagicalGuess();

		if (n1 >= 0 && n1 <= 10) {

			System.out.println("Here you go:Best of Luck Navin");

			L1: {
				if (n1 == g1.MagicalNo) {
					System.out.println("Navin You Guessed the  Magical number " + g1.MagicalNo + " in " + count + " guess");
					flag = true;
					break L1;
				} else

				if (n1 > g1.MagicalNo)
					System.out.println("You Guessed Higher.\nHint:  Guess the number below " + n1 + " to win");
				if (n1 < g1.MagicalNo)
					System.out.println("You Guessed Lower.\nHint:  Guess the number above " + n1 + " to win");
				System.out.println("count: " + count++);
				System.out.println();
				// System.out.println("Magical No " + g1.MagicalNo);

				if (count <= 5)
					NavinNo();
				else {
					System.out.println("Navin your Guesses Over\n");
				}
			}
		} else {
			System.out.println("Enter btwn 0 to 10");
			System.out.println("count: " + count++);
			System.out.println();
			// System.out.println("Magical No " + g1.MagicalNo);
			if (count <= 5)
				NavinNo();
			else {
				System.out.println("Navin your Guesses Over\n");
			}
		}

		return count;

	}

}

class Subrahmanya {
	int nitinCount;
	int hyderCount;
	int navinCount;
	Nitin n = new Nitin();
	Hyder h = new Hyder();
	Navin r = new Navin();

	void collect() {
		nitinCount = n.NitinNo();
		hyderCount = h.HyderNo();
		navinCount = r.NavinNo();
	}

	void compare() {
 B1:  {      
			if ((nitinCount < hyderCount) && (nitinCount < navinCount)) 
			{
				System.out.println("\n Nitin won");
				System.out.println();
				System.out.println("Nitin's Count: " +( nitinCount));
				System.out.println("hyder's Count: " + (hyderCount));
				System.out.println("navin's Count: " + (navinCount));
				break B1;
			}
			if ((hyderCount < nitinCount) && (hyderCount < navinCount)) 
			{
				System.out.println("\n Hyder won");
				System.out.println();
				System.out.println("Nitin's Count: " +( nitinCount));
				System.out.println("hyder's Count: " + (hyderCount));
				System.out.println("navin's Count: " + (navinCount));
				break B1;
			}
			if ((navinCount < nitinCount) && (navinCount < hyderCount)) 
			{
				System.out.println("\n Navin won");
				System.out.println();
				System.out.println("Nitin's Count: " +( nitinCount));
				System.out.println("hyder's Count: " + (hyderCount));
				System.out.println("navin's Count: " + (navinCount));
				break B1;
			}
			if ((nitinCount == hyderCount) && (navinCount == nitinCount)) 
			{
				System.out.println("\n Match Tied");
				System.out.println();
				System.out.println("Nitin's Count: " +( nitinCount));
				System.out.println("hyder's Count: " + (hyderCount));
				System.out.println("navin's Count: " + (navinCount));
				break B1;
			}
			if (nitinCount == hyderCount)
			{
				System.out.println("\nNitin and Hyder Play Again one more time");
				nitinCount = n.NitinNo();
				hyderCount = h.HyderNo();
				if (nitinCount < hyderCount) 
				{
					System.out.println("\n nitin Winner");
					System.out.println();
				} else if (hyderCount < nitinCount) 
				{
					System.out.println("\n Hyder Winner");
					System.out.println();
				} else 
				{
					System.out.println("\n Nitin & Hyder Both are Winners");
					System.out.println();
				}
				System.out.println("Nitin's Count: " +( nitinCount));
				System.out.println("hyder's Count: " + (hyderCount));
				break B1;
			}
			if (hyderCount == navinCount) 
			{
				System.out.println("\nHyder and Navin Play Again one more time");
				hyderCount = h.HyderNo();
				navinCount = r.NavinNo();
				if (hyderCount < navinCount) 
				{
					System.out.println("\n Hyder Winner");
					System.out.println();
				} else if (navinCount < hyderCount)
				{
					System.out.println("\n Navin Winner");
					System.out.println();
				} else 
				{
					System.out.println("\n Hyder & Navin Both are Winners");
					System.out.println();
				}
				System.out.println("hyder's Count: " + (hyderCount));
				System.out.println("navin's Count: " + (navinCount));
				break B1;
			}
			if (navinCount == nitinCount) 
			{
				System.out.println("\nNavin and Nitin Play Again one more time");
				navinCount = r.NavinNo();
				nitinCount = n.NitinNo();
				if (navinCount < nitinCount) 
				{
					System.out.println("\n Navin Winner");
					System.out.println();
				} else if (nitinCount < navinCount) 
				{
					System.out.println("\n Nitin Winner");
					System.out.println();
				} else 
				{
					System.out.println("\n Navin & Nitin Both are Winners");
					System.out.println();
				}
				System.out.println("navin's Count: " + (navinCount));
				System.out.println("Nitin's Count: " +( nitinCount));
				break B1;
			}
		}

	}
}

public class GuesserGameTrial_03 {

	public static void main(String[] args) {
		MagicalGuess gs = new MagicalGuess();
		Nitin nit = new Nitin();

		Hyder hyd = new Hyder();

		Navin nav = new Navin();

		Subrahmanya s = new Subrahmanya();
		s.collect();
		s.compare();
		System.out.println("\nMagical No  that played around Nitin, Hyder & Navin is: " + gs.MagicalNo);
	}

}
