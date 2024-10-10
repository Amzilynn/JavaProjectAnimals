public class ZooManagement {

    public static void main(String[] args) {
        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        Animal giraffe = new Animal("Giraffidae", "LongNeck", 7, true);

        Animal penguin = new Animal("Birds", "Pingu", 3, false);

        Animal tiger = new Animal("Big Cats", "Shere Khan", 10, true);


        Zoo cityZoo = new Zoo("City Zoo", "New York");
        Zoo safariZoo = new Zoo("Safari Park", "Kenya");

        System.out.println(cityZoo.addAnimal(dog));
        System.out.println(cityZoo.addAnimal(giraffe));
        System.out.println(cityZoo.addAnimal(penguin));

        cityZoo.displayAnimals();

        System.out.println("Searching for Giraffe: " + cityZoo.searchAnimal(giraffe));

        System.out.println("Removing Elephant: " + cityZoo.removeAnimal(dog));

        cityZoo.displayAnimals();

        System.out.println("Adding Tiger: " + cityZoo.addAnimal(tiger));
        System.out.println("Adding Penguin: " + cityZoo.addAnimal(penguin));

        cityZoo.displayAnimals();

        System.out.println("Removing Penguin: " + cityZoo.removeAnimal(penguin));
        cityZoo.displayAnimals();

    }
}
