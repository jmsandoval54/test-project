import exceptions.InvalidUserNameException;
import exceptions.InvalidUserPasswordException;

public class AuthenticationServiceTest {
	public static void main(String[] args) {
		UserAccount useraccount = new UserAccount();
		useraccount.setUserName("administrator");
		useraccount.setPassword("pass123");
		
		AuthenticationService authentication = new AuthenticationService();
		try {
			authentication.authenticate((useraccount));
			System.out.println("Valid credentials");
		} catch (InvalidUserNameException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (InvalidUserPasswordException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
