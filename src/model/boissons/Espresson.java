package model.boissons;

import model.Soldé;

public class Espresson extends Boisson implements Soldé {
    double pourcentagePromo=0.0;
    @Override
    public String description() {
        return "Cafe Espresson";
    }

    @Override
    public Double cout() {
        return (12.0-12.0*pourcentagePromo);
    }

    @Override
    public void activerPromo() {
      pourcentagePromo=0.5;
    }

    @Override
    public void arreeterPromo() {
     pourcentagePromo=0.0;
    }
}
