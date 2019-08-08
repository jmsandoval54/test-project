package exceptions;

public class InvalidUserPasswordException extends Exception {
	private String message;
	
	public InvalidUserPasswordException(String message) {
		super(message);
		this.message = message;
	}		
		@Override
		public String getMessage() {
			return this.message;
		}
		
	}

