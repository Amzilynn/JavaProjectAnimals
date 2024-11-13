package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class ZooManagement {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Safari Zoo", "Metropolis");

        Aquatic aquaticAnimal = new Aquatic("Marine Life", "Aqua", 2, true, "Sea",20.5f);
        Dolphin dolphin = new Dolphin("Cetacean", "Dolly", 3, true, "Ocean", 30.5f);
        Penguin penguin = new Penguin("Birds", "Penguin", 4, false, "Antarctic", 150.0f);

        System.out.println(aquaticAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        Dolphin speedyDolphin = new Dolphin("Cetacean", "Speedy", 5, true, "Ocean", 25.5f);
        Penguin deepPenguin = new Penguin("Birds", "Deep", 3, false, "Polar Regions", 200.0f);

        System.out.println(speedyDolphin);
        System.out.println(deepPenguin);

        aquaticAnimal.swim();
        speedyDolphin.swim();
        deepPenguin.swim();

        zoo.addAquaticAnimal(speedyDolphin);
        zoo.addAquaticAnimal(deepPenguin);
        System.out.println("Max penguin swimming depth: " + zoo.maxPenguinSwimmingDepth());
        zoo.displayNumberOfAquaticsByType();

    }
}
