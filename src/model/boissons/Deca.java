package model.boissons;

public class Deca extends Boisson{
    @Override
    public String description() {
        return "Cafe Deca";
    }

    @Override
    public Double cout() {
        return 20.0;
    }
}
