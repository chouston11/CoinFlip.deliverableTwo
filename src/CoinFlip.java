import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		String headsOrTailsGuess;
		int numberOfFlips;
		int correctCount;
		int headsCount = 0;
		int tailsCount = 0;
		String s1 = "heads";
		String s2 = "Heads";
		String s3 = "tails";
		String s4 = "Tails";
		String s5 = "HEADS";
		String s6 = "TAILS";
		boolean coinSideHeads = false;
		
		System.out.println("Guess the side of the coin we'll mostly get: heads or tails?");
		headsOrTailsGuess = scnr.next();//"heads"; case sensitive?

		//creating a way to have computer recognize input
		if(s1.equals(headsOrTailsGuess)) {
			coinSideHeads = true;
			System.out.println(s1.equals(headsOrTailsGuess));
		} else if (s3.equals(headsOrTailsGuess)) {
			coinSideHeads = false;
			System.out.println(s3.equals(headsOrTailsGuess));
		} else if(s2.equals(headsOrTailsGuess)) {//
			coinSideHeads = true;
			System.out.println(s2.equals(headsOrTailsGuess));
		} else if (s4.equals(headsOrTailsGuess)) {
			coinSideHeads = false;
			System.out.println(s4.equals(headsOrTailsGuess));
		} else if(s5.equals(headsOrTailsGuess)) {//
			coinSideHeads = true;
			System.out.println(s5.equals(headsOrTailsGuess));
		} else if (s6.equals(headsOrTailsGuess)) {
			coinSideHeads = false;
			System.out.println(s6.equals(headsOrTailsGuess));
		} else {
			System.out.println("****We can't report your guess accurately if your spelling isn't right :/ ****");
		}
		System.out.println("How many times shall we flip a coin?");
		numberOfFlips = scnr.nextInt();
		for(int i = 0; i < numberOfFlips; i++) {
			int num = (int)(Math.random() *2);
			if (num == 0) {
				System.out.println("Heads");
				headsCount++; //consider Heads++
				} else if (num == 1) {
				System.out.println("Tails");
				tailsCount++;
				}
			
			double correctPercent;
			var correctPercentHeads = ((double)headsCount/numberOfFlips*100);	
			var correctPercentTails = ((double)tailsCount/numberOfFlips*100);
			
			if(coinSideHeads == true && headsCount > tailsCount || headsCount < tailsCount || headsCount == tailsCount) {
				System.out.println("Your guess " + headsOrTailsGuess + " came up " + headsCount + " time(s). That's " + correctPercentHeads + "%.");
			} else if (coinSideHeads == false && headsCount > tailsCount || headsCount < tailsCount || headsCount == tailsCount) {
				System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
			}
		}
		
		/*if(headsCount > tailsCount && coinSideHeads == true) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + headsCount + " time(s). That's " + correctPercentHeads + "%.");
	} else if(headsCount < tailsCount && coinSideHeads == false) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
	} else if(headsCount == tailsCount && coinSideHeads == true) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
	} else if (headsCount < tailsCount && coinSideHeads == true) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + headsCount + " time(s). That's " + correctPercentHeads + "%.");
	} else if(headsCount > tailsCount && coinSideHeads == false) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
	} else if(headsCount == tailsCount && coinSideHeads == false) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
	} else if(headsCount > tailsCount && coinSideHeads == false) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentHeads + "%.");
	} else if(headsCount < tailsCount && coinSideHeads == true) {
		System.out.println("Your guess " + headsOrTailsGuess + " came up " + headsCount + " time(s). That's " + correctPercentTails + "%.");
	}*/
			/*boolean scan = null;
			if(headsOrTailsGuess == "heads") {
				scan = true;
				System.out.println(scan);
			} else if(headsOrTailsGuess == "tails") {
				scan = false;
				System.out.println(scan);
			} else {
				scan = null;
			}
			
		double correctPercent;
		var correctPercentHeads = ((double)headsCount/numberOfFlips*100);	
		var correctPercentTails = ((double)tailsCount/numberOfFlips*100);
		
		if(headsCount > tailsCount) {
			System.out.println("Your guess " + headsOrTailsGuess + " came up " + headsCount + " time(s). That's " + correctPercentHeads + "%.");
		} else if(headsCount < tailsCount) {
			System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
		} else if(headsCount == tailsCount) {
			System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
		}
		
		/*Boolean headsGreater = null;
		if(headsCount > tailsCount) {
			headsGreater = true;
			//System.out.println(headsGreater);
		} else if(headsCount < tailsCount) {
			headsGreater = false;
			//System.out.println(headsGreater);
		} else{
			headsGreater = null;
		}*/
		
		/* if(headsCount > tailsCount && headsOrTailsGuess == "heads" || headsOrTailsGuess == "Heads") {
			System.out.println("Your guess " + headsOrTailsGuess + " came up " + headsCount + " time(s). That's " + correctPercentHeads + "%.");
		} else if(headsCount < tailsCount && headsOrTailsGuess == "tails" || headsOrTailsGuess == "Tails") {
			System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
		} else if(headsCount == tailsCount && headsOrTailsGuess	 == "tails" || headsOrTailsGuess == "Tails" || headsOrTailsGuess == "heads" || headsOrTailsGuess == "Heads") {
			System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercentTails + "%.");
		}*/
		//have to make sure scanned value = integer
		//System.out.println("Your guess " + headsOrTailsGuess + " came up " + headsCount + " time(s). That's " + correctPercent + "%.");
		//System.out.println("Your guess " + headsOrTailsGuess + " came up " + tailsCount + " time(s). That's " + correctPercent + "%.");
		
		
		
		//System.out.println("Your guess " + headsOrTailsGuess + " came up " + correctCount + " time(s). That's " + correctPercent + "%.");
		
		/* String headsOrTailsGuess = scnr.next();
		int numberOfFlips = scnr.nextInt(); */
		
		/*to do:
		 * learn how to calculate. 
		*/
		//repeat coin flips based on # of flips..use #oflips variable each time
				//generate random number and use it to determine whether to show heads or tails
				//track/count correct guesses
				//at end, output user's guess as heads or tails / how many times guess came / & %offlips correct
				//HINT #1: Use Math.random( ) or Random class to generate a new number each
				
				//final print out
		
		//if, for, while, do while
				/*
				int randomNum = (int) (Math.random() *2);
				
				for (int i=0; i < numberOfFlips; i++) {
					
					int tailsCount = 0;
					int headsCount = 0;
				
				if (randomNum == 0) {
					System.out.println("Heads");
					headsCount++;
				} else if (randomNum == 1) {
					System.out.println("Tails");
					tailsCount++
				}
				
				*/
					//System
				//}
				//int g = (0);
				//do {
					//System.out.println();//randomNumber here
					//g++;
				//} while (g <= numberOfFlips);
	}

}
