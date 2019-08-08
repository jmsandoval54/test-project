import exceptions.InvalidUserNameException;
import exceptions.InvalidUserPasswordException;

public class AuthenticationService {
	public void authenticate(UserAccount userAccount) throws InvalidUserNameException, InvalidUserPasswordException{
		if(userAccount == null) {
			throw new IllegalArgumentException("User account cannot be null");
		}
		
		if("administrator".equals(userAccount.getUserName())) {
			throw new InvalidUserNameException("Invalid Username"); 
		}
		if("pass123".equals(userAccount.getPassword())) {
			throw new InvalidUserPasswordException("Invalid Password"); 
		}
	}
}
