package model.suplements;

import model.boissons.Boisson;

public abstract class Suplement extends Boisson {
    protected Boisson boisonDeBase;
    public Suplement(Boisson boisonDeBase){
        this.boisonDeBase=boisonDeBase;

    }

}
