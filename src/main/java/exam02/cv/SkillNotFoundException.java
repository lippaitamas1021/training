package exam02.cv;

public class SkillNotFoundException extends RuntimeException {

    private String message;

    public SkillNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
