package seminar1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private IngrijitorZoo ingrijitorZoo;
    private List<Animal> animale;

    public Zoo(String nume, IngrijitorZoo ingrijitorZoo) {
        this.ingrijitorZoo = ingrijitorZoo;
        this.nume = nume;
        this.animale = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        animale.add(animal);
    }
    public String getNume() {
        return nume;
    }
    public void hranesteAnimale(String hrana){
      for (Animal animal:animale){
          ingrijitorZoo.hranesteAnimal(animal, hrana);
      }
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZoo getIngrijitorZoo() {
        return ingrijitorZoo;
    }

    public void setIngrijitorZoo(IngrijitorZoo ingrijitorZoo) {
        this.ingrijitorZoo = ingrijitorZoo;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }
}
