
public class PrintDayInWord {
	public static void main(String[] args) {
		int daynumber = 5;
		
		if (daynumber == 1) {
			System.out.println("Monday");
		}else if (daynumber == 2) {
			System.out.println("Tuesday");
		}else if (daynumber == 3) {
			System.out.println("Wednesday");
		}else if (daynumber == 4) {
			System.out.println("Thursday");
		}else if (daynumber == 5) {
			System.out.println("Friday");
		}else if (daynumber == 6) {
			System.out.println("Saturday");
		}else {
			System.out.println("Not a valid day");
		}
		
		switch(daynumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		
		default:
				System.out.println("Not a valid day");
				break;
		}
	}

}
