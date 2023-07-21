
import java.util.Random;
import java.util.Scanner;
public class GuessingNumber {
	public static void main(String args[])
	{

        System.out.println("!!!!!!!!!GAME START!!!!!!!!!!");
        System.out.println("message-->>Winning score:100 & wrong move -1 point");

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(100) + 1;
		int count=0;

        int win=100;
        int negativeMove=1;
		
		while(true)
		{	
			System.out.print("Enter your Guss Number (1-100)=");
					
			int playerNumber = sc.nextInt();
			
			count++;
			
			if(playerNumber == randomNumber)
			{
				System.out.println("Correct! You  Win!");
                System.out.println("your score is:"+(win-negativeMove));
				System.out.print(count+" Time You Guss");
				break ;
			}
			else if(playerNumber < randomNumber)
			{
				
				System.out.println("Nope! the number is higher. Guss again.");
                negativeMove+=1;
				System.out.print("\n");
                
			}
			else if(playerNumber > randomNumber)
			{
				System.out.println("Nope! the number is lower. Guss again.");
                negativeMove+=1;
				System.out.print("\n");
			}

		}
	}
}