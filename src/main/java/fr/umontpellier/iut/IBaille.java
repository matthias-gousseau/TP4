package fr.umontpellier.iut;

public class IBaille {
    public static void main(String[] args) {
        Produit P = new Produit(1, "Un produit", 5, 3,2);
        Compte Compte1 = new Compte("Compte1", 50);
        OffreEnchere Offre = new OffreEnchere(0, 15);

        System.out.println();
        System.out.println(P.toStringProduit());
        System.out.println();
        System.out.println(Compte1.toStringCompte());
        System.out.println();
        System.out.println(Offre.toStringOffre());
        System.out.println();
        P.calculerGagnant(Offre);
        System.out.println(P.toStringProduit());


        
    }
}
