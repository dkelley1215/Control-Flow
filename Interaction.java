import java.util.Scanner;

public class Interaction {
	public static void main(String[] args) {
//		Circle c1 = newCircle(10);
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String Name = input.nextLine();
//		System.out.printf("Hello %s!\n",  firstName);
		System.out.println("Hello " + Name + "!");
		System.out.println("Would you like to continue?");
		String tocontinue = input.nextLine();
		if(tocontinue == "y") {
			playagain == "y";
			while playagain == "y"{
			System.out.println("Great! I'm going to ask you a few questions!");
			System.out.println("Do you have a red car? (yes, no)");
			String car = input.nextLine();
			System.out.println("What is the name of your favorite pet?");
			String petname = input.nextLine();
			System.out.println("What is the age of your favorite pet?");
			String petage = input.nextLine();
			System.out.println("What is your lucky number?");
			String luckynum = input.nextLine();
			System.out.println("Do you have a favorite quarter back?");
			String qb = input.nextLine();
			if(qb == "yes") {
				System.out.println("What is their jersey number?");
				String qbnumber = input.nextLine();
			}
			else continue;
			System.out.println("What is the two-digit model year of your car?");
			String caryear = input.nextLine();
			System.out.println("Pick a number between 1 and 50.");
			String num = input.nextLine();
			System.out.println("Lottery Numbers: ",
					caryear + petage,
					"42",
					luckynum,
					caryear,
					);
			System.out.println("Play Again? y / n");
			String playagain = input.nextLine();
			}
		}	
		else System.out.printf("Goodbye ",  Name, "!");
	}
}
