package Bob;
public class Happy implements Moods {
    String message;

    public Happy() {
        this.message = "Happy";
    }

    @Override
    public String moods() {
        return this.message;
    }
}
