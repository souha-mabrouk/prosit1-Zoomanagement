public class Zoo {
    Animal[] animals = new Animal[4];
    String name;
    String city;
    static final int nbrCages=25;
    int compteurAnimaux = 0;
    Aquatic[] aquaticAnimals = new Aquatic[10];
    private int count;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;

    }


   /* public boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            System.out.println("the Zoo is full we Cannot add " + animal.name);
            return false;
        }


        if (searchAnimal(animal) != -1) {
            System.out.println(" Animal " + animal.name + " already exists in the zoo" );
            return false;
        }


        animals[compteurAnimaux] = animal;
        compteurAnimaux++;
        System.out.println(" Animal " + animal.name + " added successfully: "  );
        return true;
    }*/

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.age < 0) {
            throw new InvalidAgeException("Animal " + animal.name + " a un âge invalide : " + animal.age);
        }

        if (compteurAnimaux >= animals.length) {
            throw new ZooFullException("Le zoo est plein. Impossible d'ajouter " + animal.name);
        }

        animals[compteurAnimaux] = animal;
        compteurAnimaux++;
        System.out.println("Animal " + animal.name + " ajouté avec succès.");
    }


    public void displayZoo() {
        System.out.println("The Zoo is named " + name + " it is located in " + city + " and contains " + nbrCages + " cages.");
    }
    public void displayAnimals() {
        System.out.println("\nList of animals in the zoo:");
        if (compteurAnimaux == 0) {
            System.out.println("No animals in the zoo yet.");
        } else {
            for (int i = 0; i < compteurAnimaux; i++) {
                Animal a = animals[i];
                System.out.println("- " + a.name + " (" + a.family + "), age: " + a.age +
                        (a.isMammal ? " [Mammal]" : " [Not Mammal]"));
            }
        }

    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < compteurAnimaux; i++) {
            Animal a = animals[i];

            if (a.name.equalsIgnoreCase(animal.name) &&
                    a.age == animal.age &&
                    a.isMammal == animal.isMammal &&
                a.family.equalsIgnoreCase(animal.family)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animals.length - 1; i++) {
            animals[i] = animals[i + 1];
        }
        return true;
    }

    public boolean isZooFull() {
        return animals.length >= nbrCages;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animals.length >= z2.animals.length) {
            return z1;
        } else {
            return z2;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (count < aquaticAnimals.length) {
            aquaticAnimals[count] = aquatic;
            count++;
            System.out.println(aquatic.name + " a été ajouté au zoo !");
        } else {
            System.out.println("Le zoo est plein, impossible d’ajouter " + aquatic.name);
        }
    }

}













































