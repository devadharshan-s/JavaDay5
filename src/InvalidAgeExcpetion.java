import java.util.Scanner;

public class InvalidAgeExcpetion extends Exception {
    InvalidAgeExcpetion() {
        super("You must be > 18 years");
    }
}

class Main{
    public static void check(int age) throws InvalidAgeExcpetion {
        if(age < 18)
            throw new InvalidAgeExcpetion();
        else
            System.out.println("You are >= 18 years");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        try {
            int age = sc.nextInt();
            check(age);
        } catch (InvalidAgeExcpetion e) {
            System.out.println(e);
        }
    }
}
