import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            if ( age < 18 ) {
                throw new AgeException("You are not able to Sign UP!!");
            }
        } catch ( Exception e ) {
            System.out.println("Some error occured :" + e);
        }
        sc.close();
    }
}
