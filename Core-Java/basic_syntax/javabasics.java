import java.util.*;
public class javabasics {
    public static void main(String[] args) {
        final String User_password = "Ayaan";
        System.out.printf("Enter the name :");
        Scanner scanner = new Scanner(System.in);
        String pwd = scanner.nextLine();
        if (User_password.equals(pwd)) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
        scanner.close();      
    }
}
