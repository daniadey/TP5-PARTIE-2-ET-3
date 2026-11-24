package heritage;

public class TestHeritage {

    public static void main(String[] args) {

        Adulte a1 = new Adulte(
                "Amine", 35, "22111222", "Ingénieur");

        Enfant e1 = new Enfant(
                "Sami", 10, "55111222", "École primaire");

        Bebe b1 = new Bebe(
                "Lina", 1, "99111222", true);

        System.out.println(a1);
        System.out.println(e1);
        System.out.println(b1);

        System.out.println("Nom : " + a1.getNom());
        System.out.println("Téléphone : " + a1.getTelephone());

        // Test de l'interface
        a1.afficherIdentite();

        // Test de l'énumération
        TypePersonne type = TypePersonne.ADULTE;

        System.out.println(type);

        for (TypePersonne t : TypePersonne.values()) {
            System.out.println(t);
        }
    }
}