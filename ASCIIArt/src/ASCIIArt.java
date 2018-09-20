/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt{
	
	public static void printDash(){
		String line1 = "\n---------------- ";
		System.out.println(line1);
	}
	
	public static void printTitle(){
		System.out.println(" < AP CS Rocks > \n ");
	}
	
	public static void printCow() {
		System.out.println("\t\\   ^__^ ");
		System.out.println("\t \\  (oo)\\________ ");
		System.out.println("\t    (__)\\\t)\\/\\ ");
		System.out.println("\t\t||----w | ");
		System.out.println("\t\t||      |\n");
	}
	
	public static void printSentence() {
		System.out.println("A cow exclaiming their love for computer science. ");
	}
	
	public static void printStarter(){
		printDash();
		printTitle();
		printCow();
		printSentence();
	}
	
	public static void main(String[] args){
		int num1 = 1;
		while (num1 <= 3) {
			System.out.println("\n"+num1);
			printStarter();
			num1 += 1;
		}
	}
}