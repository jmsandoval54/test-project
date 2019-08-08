import javax.swing.JOptionPane;

public class DialogBoxMessageRenderer implements IMessageRenderer{
	private IMessageProvider messageProvider;
	
	@Override
	public void setMessageProvider(IMessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	@Override
	public void display() {
		JOptionPane.showMessageDialog(null, messageProvider.getMessage());
	}
}
