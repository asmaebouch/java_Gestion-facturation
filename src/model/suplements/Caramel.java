package model.suplements;

import model.boissons.Boisson;

public class Caramel extends Suplement{
    public Caramel(Boisson boisonDeBase) {
        super(boisonDeBase);
    }

    @Override
    public String description() {
        return boisonDeBase.description()+" Cramel";
    }

    @Override
    public Double cout() {
        return boisonDeBase.cout()+5.0;
    }
}
