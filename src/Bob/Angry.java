package Bob;

public class Angry implements Moods {
    String message;

    public Angry() {
        this.message = "Angry";
    }

    @Override
    public String moods() {
        return this.message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
