package model.suplements;

import model.boissons.Boisson;

public class Chocolat extends Suplement{
    public Chocolat(Boisson boisonDeBase) {
        super(boisonDeBase);
    }
    @Override
    public String description() {
        return boisonDeBase.description() +" Chocolota";
    }

    @Override
    public Double cout() {
        return boisonDeBase.cout()+6.0;
    }
}
