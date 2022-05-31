package seminar1;

public class IngrijitorZoo {
    private String nume;
    public void hranesteAnimal(Animal animal,  String mancare){
        animal.mananca(mancare);

    }

    public String getNume() {
        return nume;
    }

    public IngrijitorZoo(String nume) {
        this.nume = nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
