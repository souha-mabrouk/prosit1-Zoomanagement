public class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic() {
        super(); // Appelle le constructeur par défaut de Animal
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(" is eating meat.");
        } else {
            System.out.println(" cannot eat this food.");
        }
    }
}


