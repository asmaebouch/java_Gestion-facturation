package model.boissons;

public class Colombia extends Boisson{
    @Override
    public String description() {
        return "Café Colombia";
    }

    @Override
    public Double cout() {
        return 15.0;
    }
}
