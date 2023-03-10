package edu.craptocraft.fastbreaktruck.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Tubo;

public abstract class Bebida implements Item{

    public Bebida(){};

    public Packing empaquetado(){
        return new Tubo();
    }
    
    @Override
    public String toString(){
        return this.outputFormatter();
    }
}
