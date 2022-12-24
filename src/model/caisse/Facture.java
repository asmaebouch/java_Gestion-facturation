package model.caisse;

import model.boissons.Boisson;

import java.util.Iterator;

public class Facture {
    private Commande commande;

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Double totaleCommande() {
        return
                commande.getBoissonCommande().keySet().stream()
                        .map(boisson -> boisson.cout() * commande.getBoissonCommande().get(boisson))
                        .reduce(0.0, (c1, c2) -> c1 + c2);
       /* double sommee=0.0;
        Iterator<Boisson> it=commande.getBoissonCommande().keySet().iterator();
        while(it.hasNext()){
            Boisson b=it.next();
            double prix=b.cout()*commande.getBoissonCommande().get(b);
            sommee+=prix;
        }*/
    }
    public void imprimerFacture(){
        System.out.println("==========================================");
        System.out.println("============  F A C T U R E ==============");
        System.out.println("==========================================");
        commande.getBoissonCommande().forEach(((boisson, qtee) ->{
            System.out.println(boisson);
            System.out.println("=\t\t(Qte:" +qtee+")\t\t:"+boisson.cout()*qtee+"DH");
        } ));
        System.out.println("==========================================");
        System.out.println("=>Total à payer :" +totaleCommande()+"dh");
    }
}
