package Exercise;

import java.util.*;

class GaMe {
	int Number;
	int UserInput;
	int noOffGuesses;

	// Method Of getter & setter
	public int getNoOffGuesses() {
		return noOffGuesses;
	}

	public void setNoOffGuesses(int noOffGuesses) {
		this.noOffGuesses = noOffGuesses;
	}

	// Method of Constructor
	GaMe() {
		Random Ran = new Random();
		this.Number = Ran.nextInt(100);
	}

	// Method of Input user - normal method
	int takeUserInput() {
		System.out.println("Guess The Number");
		Scanner sc = new Scanner(System.in);
		UserInput = sc.nextInt();
		return UserInput;
	}

	// Method of isCorrectNumber
	boolean isCorrectNumber() {
		noOffGuesses++;
		if (Number == UserInput) {
			System.out.println("Congratulations , You Won ! ");
			System.out.println("Your Score is : " + noOffGuesses);
			return true;
		} else if (Number < UserInput) {
			System.out.println("Too High...");
			takeUserInput();
			isCorrectNumber();
		} else {
			System.out.println("Too Low....");
			takeUserInput();
			isCorrectNumber();
		}
		return false;
	}
}

public class Ex03_Guessthenumber_Game {
	public static void main(String[] args) {
		System.out.println("Welcome to Guess the number game - Developed by Maaz Danish");
		GaMe G = new GaMe();
		G.takeUserInput();
		G.isCorrectNumber();
	}
}
/*
 * We can use while loop too ;but when we use it we dont need takeUserInput();
 * isCorrectNumber(); this to put in else statement boolean b = false;47
 * 
 * while(!b){ G.takeUserInput(); b=G.isCorrectNumber(); }}}
 */
