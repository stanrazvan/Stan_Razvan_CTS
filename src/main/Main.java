package main;

import seminar1.Girafa;
import seminar1.IngrijitorZoo;
import seminar1.Zebra;
import seminar1.Zoo;

public class Main {
    public static void main(String[] args) {
        IngrijitorZoo inrgij = new IngrijitorZoo("ingrijitor");
        Zoo z1=new Zoo("zebra1",inrgij);
        Zebra zebra1 = new Zebra("zebra1");
        Zebra zebra2 = new Zebra("zebra2");
        Girafa griafa1 = new Girafa("girafa1");
        z1.addAnimal(zebra1);
        z1.addAnimal(zebra2);
        z1.addAnimal(griafa1);
        z1.hranesteAnimale("mancare");
    }
}
