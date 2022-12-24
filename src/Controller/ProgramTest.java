package Controller;

import model.boissons.*;
import model.caisse.Commande;
import model.suplements.Chocolat;
import model.suplements.Suplement;

public class ProgramTest {
    public static void main(String[] args) {
        Boisson b1=new Chocolat(new Colombia());
        Boisson b2=new Deca();
        Boisson b3=new Bueno();
        Boisson b4=new Espresson();
        Boisson b5=new Colombia();
        Boisson b6=new Colombia();
        Espresson e=new Espresson();
        e.activerPromo();
        Commande c2=new Commande();
        c2.commander(b1,b2,b3,b4,b5,b6);
        Commande c3=new Commande();
        c3.commander(e,e,e);
        e.arreeterPromo();
        Commande c4=new Commande();
        c4.commander(e,b2,b3);
        c2.creerEtImprimeerFacture();

    }
}
