import java.util.Scanner;

public class Tutorial2_Q3{
	
public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your marks: ");
		int marks = input.nextInt();
		
		if((marks <= 100) && (marks >= 80)){
			System.out.println("Your grade is A");
		}
		else if((60 <= marks) && (marks < 80)){
			System.out.println("Your grade is B");
		}
		else if((50 <= marks) && (marks < 60)){
			System.out.println("Your grade is C");
		}
		else if((45 <= marks) && (marks < 50)){
			System.out.println("Your grade is D");
		}
		else if((25 <= marks) && (marks < 45)){
			System.out.println("Your grade is E");
		}
		else if((marks >= 0) && (marks < 25)){
			System.out.println("Your grade is F");
		}
		else{
			System.out.println("Enter valid marks.");
		}
		
	}
}