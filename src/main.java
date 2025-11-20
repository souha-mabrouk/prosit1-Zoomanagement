public class main {

    public static void main(String[] args) {


        DepartementHashSet gestion = new DepartementHashSet();


        Departement d1 = new Departement(1, "Informatique", 30);
        Departement d2 = new Departement(2, "Math", 20);
        Departement d3 = new Departement(3, "chimie", 15);
        Departement d4 = new Departement(1, "Informatique", 30);



        System.out.println("Ajout d1 : " + gestion.ajouterDepartement(d1));
        System.out.println("Ajout d2 : " + gestion.ajouterDepartement(d2));
        System.out.println("Ajout d3 : " + gestion.ajouterDepartement(d3));
        System.out.println("Ajout d4 : " + gestion.ajouterDepartement(d4));



        gestion.displayDepartement();

        // Test recherche
        System.out.println("\n=== TEST RECHERCHE ===");
        System.out.println("Recherche d1 : " + gestion.rechercherDepartement(d1)); // true
        System.out.println("Recherche d4 (clone de d1) : " + gestion.rechercherDepartement(d4)); // true
        System.out.println("Recherche d'un département inexistant : " +
                gestion.rechercherDepartement(new Departement(10, "Inexistant", 0)));

        // Test suppression
        System.out.println("\n=== TEST SUPPRESSION ===");
        System.out.println("Suppression d2 : " + gestion.supprimerDepartement(d2)); // true
        System.out.println("Suppression d2 encore : " + gestion.supprimerDepartement(d2)); // false



        gestion.displayDepartement();


        System.out.println("d1.equals(d4) ? -> " + d1.equals(d4)); // true
        System.out.println("d1.equals(d2) ? -> " + d1.equals(d2)); // false
    }

    }


