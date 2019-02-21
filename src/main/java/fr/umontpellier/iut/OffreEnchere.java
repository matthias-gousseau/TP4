package fr.umontpellier.iut;

public class OffreEnchere {
    private int prixEnCours;
    private int prixMax;
    /* private Produit Product; */

    public OffreEnchere(int prixCour, int prixMax) {
        this.prixEnCours=prixCour;
    }

    public String toStringOffre() {
        return ("\n" + "Prix en cours Enchere : " + this.prixEnCours + "\n" + "Prix Max Enchere : " + this.prixMax);
    }

    public int getPrixEnCours() {
        return (this.prixEnCours);
    }

    public int getPrixMax() {
        return (this.prixMax);
    }

    public void setPrixEnCours(int prixEnCours) {
        this.prixEnCours = prixEnCours;
    }



}