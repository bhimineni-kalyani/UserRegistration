import java.util.regex.*;
import java.util.Scanner;
public class UserRegistrationUC3 {
	private boolean check;
	private String email;
	Scanner sc = new Scanner(System.in);
	public void checkEmail() {
	   	 System.out.println("enter a valid email(Eg. abc.xyz@bl.co.in) : ");
	   	 email = sc.nextLine();
	   	 check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
	   	 if (!check) {
	   		 System.out.println(" email is invalid ");
	   		 checkEmail();
	   	 }
	   	 else
	   		 System.out.println(" email is valid ");
	 }
	 public static void main(String args[]) {
	   	   UserRegistrationUC3 user = new UserRegistrationUC3();
	   	   user.checkEmail();
	 }
}
