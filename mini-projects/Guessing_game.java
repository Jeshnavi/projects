import java.util.Scanner;
import java.util.Random;
class Guessinggame{
	public static void main(String args[]){
		Random random = new Random();
		int NumberToGuess = random.nextInt(100)+1;
		Scanner scanner=new Scanner(System.in);
		int NumberOfTries=0;
		while (true){
			System.out.println("Guess a number between 1 and 100");
			int num=scanner.nextInt();
			NumberOfTries++;
			if (num==NumberToGuess){
				System.out.println("Congratulations! you found the  number in "+ NumberOfTries + "tries.");
				break;
			}
			else if(num<NumberToGuess){
				System.out.println("Your guess is low");
			}
			else{
				System.out.println("Your guess is high");
			}
		}
	}
}

				
			
		