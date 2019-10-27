package by.epam.itcompany.exception;

public class WrongEmployeeFormatException extends Exception {
    private String message;

    public WrongEmployeeFormatException() {
        message = "Exception occurred while parsing Employee object from file";
    }

    public WrongEmployeeFormatException(String message) {
        this.message = message;
    }



    public WrongEmployeeFormatException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    @Override
    public String toString() {
        if (message == null) {
            return "Exception occurred while parsing Employee object from file";
        } else {
            return "Exception occurred while parsing Employee object from file, with message: " + message;
        }
    }
}
