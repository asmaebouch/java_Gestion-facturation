package model.caisse;

import model.boissons.*;

import java.util.*;

public class Commande {
   private Map<Boisson,Integer> boissonCommande;

    public Map<Boisson, Integer> getBoissonCommande() {
        return boissonCommande;
    }
    public Commande(){
        boissonCommande=new HashMap<>();
    }//KATrade liya dok lees boisson =>Map 1 seul paramatere awela 2 awela 3
    public void commander(Boisson... boissons) {
        List<Boisson> mesBoissons =new ArrayList<>(Arrays.asList(boissons));
        mesBoissons.forEach(boisson -> { //setkey().contain()
            if (!boissonCommande.containsKey(boisson))
            {
                boissonCommande.put(boisson, 1);
            }
            else {
                Integer qtee = boissonCommande.get(boisson);
                boissonCommande.put(boisson, ++qtee);
            }
//boissonsCommandé.put(boisoon,
        });
        System.out.println(boissonCommande);
    }
public void creerEtImprimeerFacture(){

        Facture facture=new Facture();
        facture.setCommande(this);
        facture.imprimerFacture();

}
    public void setBoissonCommande(Map<Boisson, Integer> boissonCommande) {
        this.boissonCommande = boissonCommande;
    }

    public static void main(String[] args) {
        Boisson b1=new Colombia();
        Boisson b2=new Deca();
        Boisson b3=new Bueno();
        Boisson b4=new Espresson();
        Boisson b5=new Colombia();
        Commande c1=new Commande();
        c1.commander(b1,b2,b3,b4,b5);
    }
}
