
public class CheckOddEven {
	public static void main(String[] args) {
		int number = 0;
		System.out.println("The number is " + number);
		
		int result = 0;
		result = number%2;
		if (number >= 1) {
			if (result == 1) {
				System.out.println("Odd Number");
			}			
			else {
				System.out.println("Even Number");
			}	
		}
		
		System.out.println("Bye!");
	}
}
