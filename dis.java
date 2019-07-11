import java.util.Random;
import java.util.Scanner;

public class dis{
    public static void main(String[] args){
	int randomValue1=0;
	int randomValue2=0;

	System.out.println("What is your name?");

	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	System.out.println("Hello, "+str+"! ");

	Random r1 = new Random();
	Random r2 = new Random();

	while(randomValue1 == 0 || randomValue2 == 0){
	    randomValue1 = r1.nextInt(6);
	    randomValue2 = r2.nextInt(6);
	}
	int total = randomValue1 + randomValue2;
	System.out.println("Rolling the dice...");
	System.out.println("Die 1:"+randomValue1);
	System.out.println("Die 2:"+randomValue2);
	System.out.println("Total value:"+total);

    
    }
}
