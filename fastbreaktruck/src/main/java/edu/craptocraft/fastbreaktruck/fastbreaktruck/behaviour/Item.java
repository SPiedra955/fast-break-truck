package edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour;

public interface Item {

    public String nombre();
    public Float pvp();
    public Packing empaquetado();

    public default String outputFormatter(){
        return String.format("Item: %s, Empaquetado: %s, Precio: %s %n",
                             this.nombre(), this.empaquetado().envoltorio(), this.pvp());

    }
    
}
