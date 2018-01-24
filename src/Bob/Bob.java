package Bob;

public class Bob {
    Moods moods;

    public Bob() {
        this.moods = null;
    }

    public void setMoods(Moods mood){
        this.moods = mood;
    }

    public String toString() {
        return "Bob is " + this.moods.moods();
    }

    public static void main(String[] args){
        Bob bob = new Bob();
        bob.setMoods(new Angry());
        System.out.println(bob);
        bob.setMoods(new Happy());
        System.out.println(bob);
        bob.setMoods(new OK());
        System.out.println(bob);


    }
}
