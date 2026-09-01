package ExceptionHandling;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {

        try {

            int number = Integer.parseInt("13");
            
            if (number < 18){
                throw new InvalidAgeException("Invalid Age");
            }

            System.out.println(number);

        } catch (NumberFormatException e) {

            System.out.println(
                "Invalid number format: " + e.getMessage()
            );

        } catch (InvalidAgeException e) {

            System.out.println(
                "Custom Exception: " + e.getMessage()
            );

        } catch (Exception e) {

            System.out.println(
                "General Exception: " + e.getMessage()
            );

        } finally {

            System.out.println(
                "Finally block executed"
            );
        }

        System.out.println("Program continues...");
    }
}
