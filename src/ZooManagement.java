import java.util.Scanner;

public class ZooManagement {
    static int nbrCages = 20;
    static String zooName = "my Zoo";

    //ZooManagement zoo=new ZooManagement();

    public static void main(String[] args) {
        //sSystem.out.println(zooName + " comporte " + nbrCages + " cages.");

        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("donner le nom de zoo");
        zoo.zooName = scanner.nextLine();*/
        do {
            System.out.println("Donner le nom du zoo :");
            zoo.zooName = scanner.nextLine();
            if (zoo.zooName.isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne peut pas être vide !");
            }
        } while (zoo.zooName.isEmpty());
        /*System.out.println("donner le nombre des cages");
        zoo.nbrCages = scanner.nextInt();*/
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
    }
}
 /*public static void main (String [] args) {
     System.out.println( zooName + "comporte" + nbrCages + "cages.");
 }*/