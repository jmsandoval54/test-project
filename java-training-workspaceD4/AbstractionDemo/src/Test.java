

/*
interface DatabaseConstant{
	int MAX_AGE = 65; //public static and final
}
*/

class StringValidator {
	public void isNullorEmpty(String testString) throws Exception{
		if(testString == null || testString.trim().length() == 0) {
			//throw new IllegalArgumentException("String value cannot be empty");
			throw new Exception("String value cannot be empty");
		}
	}
}
public class Test {
	public static final int MAX_AGE = 65; //Caps : static and final
	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2); //true
		
		String str1a = new String("Hello"); //pointing to memory allocation(reference)
		String str2a = new String("Hello");
		System.out.println(str1a == str2a); //false
		System.out.println(str1a.equals(str2a)); //true
		
		Shape shape = new Square();
		shape.computeArea();
		shape.display();
		
		//////////
		String nullStr = null;
		String notANumber = "abc";
		
		try {
			StringValidator stringValidator = new StringValidator();
			
			try {
				stringValidator.isNullorEmpty("Hello");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Valid");
		
			/*
			boolean isEqual = nullStr.equals("Hello");
			
			float num = Float.parseFloat(notANumber);
			
			System.out.println("Success"); // bypassed
			
			
			
		}catch(NumberFormatException e) {
			System.out.println("Unable to parse" + e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Object must be initialize" + e.getMessage());
		}catch(Exception e) {
			System.out.println("e.getMessage");
			e.printStackTrace();
			*/
		}finally {
			System.out.println("finally");
		}
		
	}
	
}
