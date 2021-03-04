import java.util.regex.*;
import java.util.Scanner;
public class UserRegistrationUC5678 {
	private boolean check;
	private String password;
	Scanner sc = new Scanner(System.in);
	public void checkPassword() {
	   	 System.out.println("enter password(8 to 10 character): ");
	   	 password = sc.nextLine();
	   	 check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}$").matcher(password).matches();
	   	 if (!check) {
	   		 System.out.println(" password invalid ");
	   		 checkPassword();
	   	 }
	   	 else
	   		 System.out.println(" password valid ");
	 }
	 public static void main(String args[]) {
	   	   UserRegistrationUC5678 user = new UserRegistrationUC5678();
	   	   user.checkPassword();
	 }
}
