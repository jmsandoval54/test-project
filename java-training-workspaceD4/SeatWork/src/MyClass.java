import java.util.Scanner;

public class MyClass {
	
	static double _discount_Percentage = .1;
    double _discount_Amt;
    static char _question ='n';
	public static void main(String[] args) {
		
		String _ans;
		
		//_ans = _ask(_ans);
		do
			{
			int ans = 0;
			System.out.println("Welcome to the Invoice Total Calculator");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter subtotal : ");
			String stringAmount = scanner.nextLine();
			float amount = Float.parseFloat(stringAmount);
			double _discount_Amt = amount * _discount_Percentage;
			double _subTotal = amount - _discount_Amt;
			String _total = String.valueOf(_subTotal);
			 
			
			System.out.println("Discount percent :" + _discount_Percentage);
			System.out.println("Discount amount :" + _discount_Amt);
			System.out.println("Invoice Total :" + _total);
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Continue? ");
			_ans = scanner1.next();	
			
		}while(_ans.equalsIgnoreCase("y"));
		
	}
	/*
	public static String _ask(String x) {
		int ansF = 0;
		if (x == "n"){
			ansF = 1;
		}
		return String.valueOf(ansF); 
	}
	*/
}
