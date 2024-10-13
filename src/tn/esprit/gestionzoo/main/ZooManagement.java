package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Aquatic aquaticAnimal = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        System.out.println(aquaticAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        Dolphin speedyDolphin = new Dolphin("Cetacea", "Speedy", 5, true, "Ocean", 25.5f);
        Penguin deepPenguin = new Penguin("Birds", "Deepy", 3, false, "Polar Regions", 200.0f);

        System.out.println(speedyDolphin);
        System.out.println(deepPenguin);

        aquaticAnimal.swim();
        speedyDolphin.swim();
        deepPenguin.swim();
    }
}
