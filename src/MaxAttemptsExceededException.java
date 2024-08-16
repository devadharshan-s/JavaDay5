import java.util.Scanner;

public class MaxAttemptsExceededException extends Exception {
    MaxAttemptsExceededException(String message) {
        super(message);
    }
}

class MaxAttemptsExceededExceptionMain{
    static int attempts = 2;
    static String key ="@Shwer1";
    static void authenticate(String password) throws MaxAttemptsExceededException {
        if(attempts == 0) throw new MaxAttemptsExceededException("Max attempts exceeded");
        else if(password != key) --attempts;
        else System.out.println("Login Successful");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (attempts >= 0) {
            try {
                System.out.println("Enter your password: ");
                System.out.println("Remaining attempts: " + attempts);
                String password = sc.nextLine();
                authenticate(password);
            } catch (MaxAttemptsExceededException e) {
                System.out.println(e);
                break;
            }
        }
    }
}
