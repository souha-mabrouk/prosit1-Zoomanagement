public class main {

    public static void main(String[] args) {


        DepartementHashSet gestion = new DepartementHashSet();


        Department d1 = new Department(1, "Informatique", 30);
        Department d2 = new Department(2, "Math", 20);
        Department d3 = new Department(3, "chimie", 15);
        Department d4 = new Department(1, "Informatique", 30);



        System.out.println("Ajout d1 : " +  IDepartment.ajouterDepartement(d1));
        System.out.println("Ajout d2 : " +  IDepartment.ajouterDepartement(d2));
        System.out.println("Ajout d3 : " +  IDepartment.ajouterDepartement(d3));
        System.out.println("Ajout d4 : " +  IDepartment.ajouterDepartement(d4));



        gestion.displayDepartement();

        // Test recherche
        System.out.println("\n=== TEST RECHERCHE ===");
        System.out.println("Recherche d1 : " + gestion.rechercherDepartement(d1)); // true
        System.out.println("Recherche d4 (clone de d1) : " + gestion.rechercherDepartement(d4)); // true
        System.out.println("Recherche d'un département inexistant : " +
                gestion.rechercherDepartement(new Department(10, "Inexistant", 0)));

        // Test suppression
        System.out.println("\n=== TEST SUPPRESSION ===");
        System.out.println("Suppression d2 : " + IDepartment.supprimerDepartement(d2)); // true
        System.out.println("Suppression d2 encore : " +  IDepartment.supprimerDepartement(d2)); // false



        gestion.displayDepartement();


        System.out.println("d1.equals(d4) ? -> " + d1.equals(d4)); // true
        System.out.println("d1.equals(d2) ? -> " + d1.equals(d2)); // false
    }

    }


