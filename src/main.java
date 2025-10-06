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
    }
}
