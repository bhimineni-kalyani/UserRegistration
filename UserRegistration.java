import java.util.regex.*;
import java.util.Scanner;
public class UserRegistrationUC4 {
	private boolean check;
	private String phoneNumber;
	Scanner sc = new Scanner(System.in);
	public void checkPhoneNumber() {
	   	 System.out.println("enter a valid (Eg. 91 9919819801) : ");
	   	 phoneNumber = sc.nextLine();
	   	 check = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
	   	 if (!check) {
	   		 System.out.println(" phone number is invalid ");
	   		 checkPhoneNumber();
	   	 }
	   	 else
	   		 System.out.println(" phone number is valid ");
	}
	public static void main(String args[]) {
	   	 UserRegistrationUC4 user = new UserRegistrationUC4();
	   	 user.checkPhoneNumber();
	}
}
