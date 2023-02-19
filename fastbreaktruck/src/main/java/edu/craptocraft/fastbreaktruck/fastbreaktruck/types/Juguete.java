package edu.craptocraft.fastbreaktruck.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Caja;

public abstract class Juguete implements Item{

    public Juguete(){};

    @Override
    public Packing empaquetado(){
        return new Caja();
    }

    @Override
    public String toString(){
        return this.outputFormatter();
    } 
}
