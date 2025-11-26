/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_chiera;

/**
 *
 * @author juliette
 */
public class TP2_relation_CHIERA {
    public static void main(String[] args) {
        // 3. Création des objets demandés
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        System.out.println("\n--- Etablissement de relations (manuelles) ---");
        // 8. Ajout de la relation "Bob est proprietaire d'une Clio" (manuellement)
        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;

        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0]);

        // 9. Ajout d'une seconde voiture à Bob (utilisons la méthode ajouter_voiture)
        boolean ajout = bob.ajouter_voiture(uneAutreClio);
        System.out.println("\nAjout de uneAutreClio à Bob via ajouter_voiture(): " + ajout);
        System.out.println("Bob maintenant : " + bob);
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println("Bob.liste_voitures[" + i + "] = " + bob.liste_voitures[i]);
        }

        // Ajout de deux voitures à Reno
        System.out.println("\nTentative d'ajout de une2008 et uneMicra à Reno :");
        boolean ajout1 = reno.ajouter_voiture(une2008);
        boolean ajout2 = reno.ajouter_voiture(uneMicra);
        System.out.println("ajout une2008 -> Reno : " + ajout1);
        System.out.println("ajout uneMicra -> Reno : " + ajout2);
        System.out.println("Reno maintenant : " + reno);
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println("Reno.liste_voitures[" + i + "] = " + reno.liste_voitures[i]);
        }

        // Vérification d'intégrité : tenter d'ajouter une voiture déjà possédée à une autre personne
        System.out.println("\nTentative d'ajouter une2008 (déjà possédée par Reno) à Bob :");
        boolean ajoutImpossible = bob.ajouter_voiture(une2008);
        System.out.println("ajout (doit être false) : " + ajoutImpossible);

        // Vérifier limite de 3 voitures : on va essayer d'ajouter 2 voitures supplémentaires à Reno.
        System.out.println("\nTester la limite de 3 voitures pour Reno:");
        Voiture v1 = new Voiture("Test1", "MarqueA", 2);
        Voiture v2 = new Voiture("Test2", "MarqueB", 2);
        boolean r1 = reno.ajouter_voiture(v1); // devrait réussir (3ème voiture)
        boolean r2 = reno.ajouter_voiture(v2); // devrait échouer (plein)
        System.out.println("ajout v1 (3ème) -> " + r1);
        System.out.println("ajout v2 (4ème) -> " + r2);
        System.out.println("Reno final : " + reno);
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println("Reno.liste_voitures[" + i + "] = " + reno.liste_voitures[i]);
        }
    }
}

