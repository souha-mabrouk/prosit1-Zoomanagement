import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        listeEmployes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe e) {
        this.listeEmployes.add(e);
        System.out.println("Employé ajouté : " + e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                System.out.println("Employé trouvé : " + e);
                return true;
            }
        }
        System.out.println("Employé non trouvé avec le nom : " + nom);
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        boolean found = listeEmployes.contains(e);
        System.out.println(found ? "Employé trouvé : " + e : "Employé non trouvé : " + e);
        return found;
    }

    @Override
    public void supprimerEmploye(Employe e) {
        if (listeEmployes.remove(e)) {
            System.out.println("Employé supprimé : " + e);
        } else {
            System.out.println("Employé non trouvé pour suppression : " + e);
        }
    }

    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés :");
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, Comparator.comparingInt(Employe::getId));
        System.out.println("Liste triée par ID.");
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, Comparator
                .comparing(Employe::getNom)
                .thenComparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
        System.out.println("Liste triée par Nom, Département et Grade.");
    }
}
