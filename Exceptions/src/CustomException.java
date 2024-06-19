public class CustomException {
    public static void validate(int age) throws InvalidAgeException {
           if(age < 18) {
                throw new InvalidAgeException("Age is not valid");
            } else {
                System.out.println("Welcome to vote......");
            }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch(InvalidAgeException ex) {
            System.out.println("Caught the exception: " + ex.getMessage());
        }
        System.out.println("rest of the code...");
    }
}
