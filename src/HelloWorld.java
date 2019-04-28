import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		String message = "Hello, World";
System.out.println(message);
		
String typeOffood = "Ice Cream.";
System.out.println("I love " +typeOffood+ " It's the best!");

Scanner input = new Scanner(System.in);
System.out.println("Enter a color, please");
String response = input.nextLine();

if(response.toLowerCase().equals("red")) {
	System.out.println("Roses can be red. Also, lilies");
}
	String palindrome = "Child, Toy, Life";
	int palindromeLength = palindrome.length();
	System.out.println(palindrome + " has " + palindromeLength + " characters.");
	System.out.println("Renee said, \"My laptop is purple\".");
	System.out.println("Coding is fun. \nSecond line");
	System.out.println("\tThis line is indented.");
	
	System.out.println("Enter your first name, please");
	String firstName = input.nextLine();
	System.out.println("Enter your last name, please");
	String lastName = input.nextLine();
	int firstNameLength = firstName.length();
	int lastNameLength = lastName.length();
	if(firstNameLength == lastNameLength) {
		System.out.println("The names are equal length");
	} else {
	if(firstNameLength > lastNameLength) {
		System.out.println("Your first name is longer than your last");
	} else {
	if(firstNameLength < lastNameLength){ 
		System.out.println("Your last name is last name is longer than your first name.");
	}{
   	System.out.println("What has 4 wheels and flies?");
	String RiddleAnswer=input.nextLine();
	if(RiddleAnswer.toLowerCase().equals("garbage + truck"));
		System.out.println("Correct!!");}
	
	int count = 1;
	while (count < 11) {
		System.out.println("The count is " + count);
		count++; //remember, this increases the value of a count by 1
	}
	}
	}
	}
}


	
		
	

