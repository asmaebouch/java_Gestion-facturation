package model.boissons;

public class Bueno extends Boisson{
    @Override
    public String description() {
        return "Cafe Bueno";
    }

    @Override
    public Double cout() {
        return 25.0;
    }
}
