import java.util.Scanner;

public class DlEstimator {
	public static void main(String[] args) {	
		String _ans;
		do
		{
		int ans = 0;
		System.out.println("Welcome to the Download estimator");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file size (MB) : ");
		String StrSize = scanner.nextLine();
		int ISize = Integer.parseInt(StrSize);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter download speed (MB/sec) : ");
		String StrSpeed = scanner1.nextLine();
		int ISpeed = Integer.parseInt(StrSpeed);
		int _TimeTotal = ISize / ISpeed;
		
		int _hr = (_TimeTotal % 86400) / 3600;
		int _min = (_TimeTotal % 3600) / 60;
		int _sec = _TimeTotal % 60;
		
		/*
		double temp_min;
		double temp_sec;
		if (_TimeTotal >= 3600) {
			_hr = _TimeTotal / 3600;
			temp_min = _TimeTotal - ((int)_hr / 60); 
			_min = temp_min / 60;
			temp_sec = _TimeTotal - ((int)_min * 60);
			_sec = temp_sec;
		}else {
			_min = _TimeTotal / 60;
			temp_sec = _TimeTotal - ((int)_min * 60);
			_sec = temp_sec ;
		} 
		*/
		int _IntHr = (int)_hr; 
		int _Intmin = (int)_min;
		int _Intsec = (int)_sec;
		
		System.out.println("This download will take approximately " + _IntHr + " hours " + _Intmin + " minutes " + _Intsec + " seconds");
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Continue? ");
		_ans = scanner2.next();	
		}while(_ans.equalsIgnoreCase("y"));
	}
}
