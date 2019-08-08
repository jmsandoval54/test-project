package exceptions;

public class InvalidUserNameException extends Exception {
	private String message;
	
	public InvalidUserNameException(String message) {
		super(message);
		this.message = message;
	}		
		@Override
		public String getMessage() {
			return this.message;
		}
		
	}

