package model.boissons;

import java.util.Objects;

public abstract class Boisson {

    public abstract String description() ;

    public abstract Double cout() ;

    @Override
    public final String toString() {
        return "=>"+description()+"=";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Boisson b){
            return this.description().equals(b.description());
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(description());
    }
}
