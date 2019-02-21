package fr.umontpellier.iut;
import java.util.ArrayList;

public class Produit {
    private int numProduit;
    private String description;
    private int prixCourant;
    private static int montantMin;
    private int coutParticipation;
    public ArrayList<OffreEnchere> listeOffres = new ArrayList<OffreEnchere>();

    public Produit(int numP, String descript, int prixC, int coutParticip, int prixMin) {
        this.numProduit = numP;
        this.description = descript;
        this.prixCourant = prixC;
        this.coutParticipation = coutParticip;
        this.montantMin=prixMin;
    }

    private void setmontantMinim(int montantMinimum) {
        this.montantMin = montantMinimum;
    }

    public boolean demarrerEnchere() {
        boolean bool;
        if (this.prixCourant < this.montantMin) {
            bool = false;
        }
        else {
            bool = true;
            this.prixCourant = this.prixCourant + this.coutParticipation;
        }
        return bool;
    }


    public boolean arreterEnchere() {
        return false;
    }

    public String toStringProduit() {
        return("\n" + "Produit : " + this.description + "\n" + "Montant Minimum : " + montantMin + "\n"
                + "Coût Participation : " + this.coutParticipation + "\n" + "Prix Courant : " + this.prixCourant);
    }

    public void ajouterOffre(OffreEnchere Offre) {
        boolean bool;
        if (arreterEnchere() || !demarrerEnchere()) {
            System.out.println("\n Offre invalide !!!");
        }
        else {
            listeOffres.add(Offre);
        }
    }

    public OffreEnchere calculerGagnant(OffreEnchere Offre) {
        int prixMax = Offre.getPrixMax();
        Offre = new OffreEnchere(this.prixCourant, prixMax);
        if (prixCourant < prixMax && demarrerEnchere()) {
            return Offre;
        }

        return Offre;
    }
}

