package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;
    private float swimmingDepth;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
        this.swimmingDepth = swimmingDepth;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                ", swimmingDepth=" + swimmingDepth +
                "} " + super.toString();
    }
}
