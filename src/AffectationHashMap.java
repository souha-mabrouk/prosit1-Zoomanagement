import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {

    Map<Employe, Department> affectation = new HashMap<>();

    // Constructeur
    public AffectationHashMap(Map<Employe, Department> affectation) {
        this.affectation = affectation;
    }

    // Constructeur vide
    public AffectationHashMap() {}

    // Instruction 2
    public void ajouterEmployeDepartement(Employe e, Department d) {
        this.affectation.put(e, d);
    }

    // Instruction 3
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Department> entry : affectation.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    // Instruction 4
    public void supprimerEmploye(Employe e) {
        this.affectation.remove(e);
    }

    // Instruction 5
    public void supprimerEmployeEtDepartement(Employe e, Department d) {
        if (this.affectation.containsKey(e) && this.affectation.get(e).equals(d)) {
            this.affectation.remove(e);
        }
    }

    // Instruction 6
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectation.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Department d : affectation.values()) {
            System.out.println(d);
        }
    }

    // Instruction 8
    public boolean rechercherEmploye(Employe e) {
        return affectation.containsKey(e);
    }

    // Instruction 9
    public boolean rechercherDepartement(Department d) {
        return affectation.containsValue(d);
    }

    // Instruction 10
    public TreeMap<Employe, Department> trierMap() {
        return new TreeMap<>(affectation);
    }
}
