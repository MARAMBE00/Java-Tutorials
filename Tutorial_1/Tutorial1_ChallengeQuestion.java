import java.text.DecimalFormat; 

public class Tutorial1_ChallengeQuestion{
	
	public static void main(String args[]){
		
		double number = 1234567.456;
		
		//double newNumber = Math.round(number*10.0)/10.0;;
		String format1 = new DecimalFormat("#,###.0").format(number);
		
		System.out.println(format1);
	}
}