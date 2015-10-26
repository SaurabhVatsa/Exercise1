import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {
	public static void main(String[] args) {

		System.out.println("Hello ASE2015 - how are you now? :) \nPlease enter your name :");
		Scanner inputScanner = new Scanner(System.in);
		(new HelloUser(inputScanner.nextLine())).greetUser();
		inputScanner.close();
	}
}
