package model.suplements;

import model.boissons.Boisson;

public class Lait extends Suplement{
    public Lait(Boisson boisonDeBase) {
        super(boisonDeBase);
    }

    @Override
    public String description() {
        return boisonDeBase.description()+" Lait";
    }

    @Override
    public Double cout() {
        return boisonDeBase.cout()+7.0;
    }
}
