import java.util.Scanner;

public class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super(message);
    }
}

class InvalidLoginExceptionMain{
    static void login(String userName, String password){
        if(userName == "" || password == ""){
            throw new InvalidLoginException("Invalid username or password");
        } else {
            System.out.println("Login Successful");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter your username: ");
            String userName = sc.nextLine();
            System.out.println("Enter your password: ");
            String password = sc.nextLine();
            login(userName, password);
        }catch (InvalidLoginException e){
            System.out.println(e);
        }
    }
}