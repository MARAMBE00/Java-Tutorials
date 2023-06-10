import java.util.*;

public class Tutorial2_Q5{
	
public static void main(String[] args){
	
		char cha;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		cha = input.next().charAt(0);
		
		if(cha>='A' && cha<='Z'){
			System.out.println(cha + " is an uppercase letter");
		}
		else if(cha>='a' && cha<='z'){
			System.out.println(cha + " is lowercase letter");
		}
		else{
			System.out.println(cha + " is not an alphabets");
		}
	}
}