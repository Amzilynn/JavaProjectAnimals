package tn.esprit.gestionzoo.entities;

public class Zoo {

    private static final int NUMBER_OF_CAGES = 25;
    private static final int NUMBER_OF_AQUATIC_ANIMALS = 10;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private String name;
    private String city;
    private int nbrAnimals;
    private int nbrAquaticAnimals;

    public Zoo(String name, String city) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatic[NUMBER_OF_AQUATIC_ANIMALS];
        this.name = name;
        this.city = city;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < NUMBER_OF_AQUATIC_ANIMALS) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("Aquatic animals array is full.");
        }
    }

    // Instruction 29: Find max penguin swimming depth
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Penguin) {
                Penguin penguin = (Penguin) aquatic;
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    // Instruction 30: Display number of aquatics by type
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic instanceof Dolphin) {
                dolphinCount++;
            } else if (aquatic instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrAnimals=" + nbrAnimals +
                ", nbrAquaticAnimals=" + nbrAquaticAnimals +
                '}';
    }
}
