package collectionsqueue.collectionspriorityqueue;

public class NoJobException extends RuntimeException {

    private String message;

    public NoJobException(String message) {
        this.message = message;
    }

    public NoJobException(String message, String message1) {
        super(message);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
