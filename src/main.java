public class main {

    public static void main(String[] args) {
        //sSystem.out.println(zooName + " comporte " + nbrCages + " cages.");

        ZooManagement zoo = new ZooManagement();
        /*Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Donner le nom du zoo :");
            zoo.zooName = scanner.nextLine();
            if (zoo.zooName.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne peut pas être vide !");
            }
        } while (zoo.zooName.isEmpty());
        do {
            System.out.println("Donner le nombre des cages :");
            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un ENTIER positif !");
                scanner.next();
            }
            zoo.nbrCages = scanner.nextInt();
            if (zoo.nbrCages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être POSITIF !");
            }
        } while (zoo.nbrCages <= 0);
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
    */
        Animal lion=new Animal("Felidae","simba",10,true);
        Animal turtle=new Animal("Testudinidae","chou",30,false);
        Animal panda=new Animal("Ursidae","poe",3,true);
        Animal tiger=new Animal("Felidae","tigress",8,true);
        Animal snake=new Animal("Elapidae","viper",6,false);
        Zoo suezoo=new Zoo("belvedere",
                "tunis",
                100);


        suezoo.displayZoo();
        System.out.println(suezoo) ;
        System.out.println(suezoo.toString()) ;
        System.out.println(suezoo.addAnimal(lion));
        System.out.println(suezoo.addAnimal(turtle));
        System.out.println(suezoo.addAnimal(panda));
        System.out.println(suezoo.addAnimal(snake));




        suezoo.displayZoo();
       suezoo.displayAnimals();


        int index1 = suezoo.searchAnimal(lion);
        System.out.println("index1= " + index1);
        Animal python=new Animal("Elapidae","viper",6,false);
        int index2 = suezoo.searchAnimal(python);
        System.out.println("index2= " + index2);
        int index3 = suezoo.searchAnimal(tiger);
        System.out.println("index3= " + index3);

        System.out.println("\nSuppression de lion");
        boolean r1=suezoo.removeAnimal(lion);
        System.out.println(r1);
        System.out.println("\nTentative de suppression d’un animal inexistant (Tiger)...");
        boolean r2 = suezoo.removeAnimal(new Animal("Feline", "roar", 4, true));
        System.out.println(r2);
        suezoo.displayAnimals();
        Zoo zoo1 = new Zoo("aniland", "Tozeur", 10);
        Zoo zoo2 = new Zoo("zooPark", "Sousse", 5);



        Animal lionne=new Animal("Felidae", "scar", 5, true);
        zoo1.addAnimal(lionne);
        Animal wolf=new Animal("Canidae", "pipe", 3, true);
        zoo1.addAnimal(lionne);
        zoo2.addAnimal(new Animal("Elephantidae", "Dumbo", 10, true));

        System.out.println("\n Is " + zoo1.name + " full? " + zoo1.isZooFull());
        System.out.println("Is " + zoo2.name + " full? " + zoo2.isZooFull());


        Zoo biggerZoo = Zoo.compareZoo(zoo1, zoo2);
        System.out.println("\nThe zoo with more animals is: " + biggerZoo.name +
                " with " + biggerZoo.animals.length + " animals.");

        zoo1.displayAnimals();
        zoo2.displayAnimals();

        Aquatic fish = new Aquatic("Poisson", "Nemo", 2, false, "Ocean");
        Aquatic daulphin = new Aquatic("Dauphin", "dido", 5, true, "sea");
        Aquatic shark = new Aquatic("Requin", "adaulph", 8, false, "Ocean");




    }
}
