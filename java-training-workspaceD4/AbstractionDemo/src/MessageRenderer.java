
public class MessageRenderer extends BaseMessageRenderer implements IMessageRenderer{
	/*
	private IMessageProvider messageProvider;
	//private IMessageRenderer messageRenderer;
	@Override
	public void setMessageProvider(IMessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	*/
	
	@Override
	public void display() {
		System.out.println("Message : " + messageProvider.getMessage());
	}
}
