public class ExceptionHandlingTest {
    
    static void checkAge(int age) throws MyException{
      if (age < 18) {
        // throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        throw new MyException("This is custom exception object");
      }
      else {
        System.out.println("Access granted - You are old enough!");
      }
    }
  
    public static void main(String[] args) throws MyException{
        try{
            checkAge(15); // Set age to 15 (which is below 18...)
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  }

  class MyException extends Exception{
    private String message;
    public MyException(String errMessage){
        this.setMessage(errMessage);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
  