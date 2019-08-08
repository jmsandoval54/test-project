
public class messageTest {
	public static void main(String[] args) {
	IMessageProvider mp = new MessageProvider();
	IMessageRenderer mr = new MessageRenderer();
	mr.setMessageProvider(mp);
	mr.display();
	
	mp = new DatabaseMessageProvider();
	mr = new DialogBoxMessageRenderer();
	mr.setMessageProvider(mp);
	mr.display();
	
	//IMessageProvider mp = new MessageProvider();
	//IMessageRenderer mr = new MessageRenderer();
	//mr.setMessageProvider(mp);
	//mr.display();
	}
}
