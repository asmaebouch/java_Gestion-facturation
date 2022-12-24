package model.boissons;

public class Sumatra extends Boisson{
    @Override
    public String description() {
        return "Cafe Sumatra";
    }

    @Override
    public Double cout() {
        return 18.0;
    }
}
