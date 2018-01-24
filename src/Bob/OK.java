package Bob;

public class OK implements Moods {
    String message;

    public OK() {
        this.message = "OK";
    }

    @Override
    public String moods() {
        return this.message;
    }
}
