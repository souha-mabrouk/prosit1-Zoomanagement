import java.util.Scanner;

public class ZooManagement {
    static int nbrCages = 20;
    static String zooName = "my Zoo";

    //ZooManagement zoo=new ZooManagement();

    public static void main(String[] args) {
        //sSystem.out.println(zooName + " comporte " + nbrCages + " cages.");

        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le nom de zoo");
        zoo.zooName = scanner.nextLine();
        System.out.println("donner le nombre des cages");
        zoo.nbrCages = scanner.nextInt();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
    }
}
 /*public static void main (String [] args) {
     System.out.println( zooName + "comporte" + nbrCages + "cages.");
 }*/