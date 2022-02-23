package seminar1;

public class Zebra extends  Animal {
    public Zebra(String name) {
        super(name);
    }

    @Override
    public void mananca(String hrana) {
        System.out.println("Zebra "+ getName() + " mananca " + hrana);
    }
}
