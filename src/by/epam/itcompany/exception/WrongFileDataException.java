package by.epam.itcompany.exception;

public class WrongFileDataException extends Exception {
    private String message;

    public WrongFileDataException() {
        message = "Exception occurred while reading file";
    }

    public WrongFileDataException(String message) {
        this.message = message;
    }


    public WrongFileDataException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    @Override
    public String toString() {
        if (message == null) {
            return "Exception occurred while reading file";
        } else {
            return "Exception occurred while reading file, with message: " + message;
        }
    }
}
