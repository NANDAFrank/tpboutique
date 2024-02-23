import java.time.LocalDate; // import pour les dates
import java.util.ArrayList;
import java.util.List;

// Classe pour les produit
class Produit {
    private String nom; // le nom du produit
    private String description; // décrition du produit
    private int prix; // le prix du produit

    // Créer un nouveaux produit avec un nom, une description et un prix
    public Produit(String nom, String description, int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    // Récuper le nom du produit
    public String getNom() {
        return nom;
    }

    // Change le nom du produit
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Récupère la décrition du produit
    public String getDescription() {
        return description;
    }

    // Change la décrition du produit
    public void setDescription(String description) {
        this.description = description;
    }

    // Récupère le prix du produit
    public int getPrix() {
        return prix;
    }

    // Change le prix du produit
    public void setPrix(int prix) {
        this.prix = prix;
    }

    // Afficher le nom, la décription et le prix du produit
    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Decrition : " + description);
        System.out.println("Prix : " + prix);
    }
}

// Classe pour un boutique
class Boutique {
    private List<Produit> produits; // liste des produits dans le boetique

    // Créer une nouvele boetique avec une liste vide de produits
    public Boutique() {
        produits = new ArrayList<>();
    }

    // Ajout un produit à la boetique
    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    // Récupère la liste des produits de la boutique
    public List<Produit> getProduits() {
        return produits;
    }

    // Affiche tous les produits dans la boztique
    public void afficherStock() {
        for (Produit produit : produits) {
            produit.afficher();
        }
    }
}

// Classe pour un pannier
class Panier {
    private List<Produit> produits; // liste des produits dans le pannier

    // Créer un nouveu pannier avec une liste vide de produits
    public Panier() {
        produits = new ArrayList<>();
    }

    // Ajout un produit au panier
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    // Calcul le prix total du panier en additionnant les prix de tous les produits
    public int prixTotalPanier() {
        int total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix();
        }
        return total;
    }
}

// Classe principale contenant la méthode principale (main)
public class ProgrammePrincipal {
    public static void main(String[] args) {
        // Créer une nouvele boutique
        Boutique boutique = new Boutique();

        // Ajoute quelques produits à la boetique
        boutique.addProduit(new Produit("Ordinateur", "Ordinateur portable", 1200));
        boutique.addProduit(new Produit("Pain", "Pain de campagne", 2));
        boutique.addProduit(new Produit("Eau minérale", "Eau de source", 1));

        // Affiche les produits disponibles dans la boutique
        System.out.println("Liste des produits disponibles :");
        boutique.afficherStock();

        // Créer un nouveu panier
        Panier panier = new Panier();

        // Ajoute quelques produits au panier
        panier.ajouterProduit(new Produit("Smartphone", "Smartphone haut de gamme", 900));
        panier.ajouterProduit(new Produit("Lait", "Lait entier", 1));
        panier.ajouterProduit(new Produit("Soda", "Soda cola", 2));

        // Affiche le prix total du panier
        System.out.println("Le prix total du pannier est : " + panier.prixTotalPanier() + " euros.");
    }
}