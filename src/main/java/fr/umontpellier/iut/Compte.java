package fr.umontpellier.iut;
import java.util.ArrayList;

public class Compte {
    private String pseudo;
    private String email;
    private String adresse;
    private int soldeCompte;
    public ArrayList<fr.umontpellier.iut.OffreEnchere> listeOffreEncheres = new ArrayList<OffreEnchere>();

    public Compte(String pseudonyme, int soldeDuCompte) {
        this.pseudo = pseudonyme;
        this.soldeCompte = soldeDuCompte;
    }

    public void crediterCompte(int sommeEnchere) {
        this.soldeCompte = this.soldeCompte - sommeEnchere;
    }

    public String toStringCompte() {
        return ("\n" + "Pseudo : " + this.pseudo + "\n" + "Solde du Compte : " + this.soldeCompte);
    }

    public void creerOffre(int prixCourant, int prixMax) {
        OffreEnchere Offre = new OffreEnchere(prixMax, prixCourant);
        listeOffreEncheres.add(Offre);
    }

}