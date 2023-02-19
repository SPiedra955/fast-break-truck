package edu.craptocraft.fastbreaktruck.fastbreaktruck.types;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Item;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Packing;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Caja;

public abstract class Cereales implements Item{

    public Cereales(){};
    
    public Packing empaquetado(){
        Caja caja = new Caja();
        return caja;
    }

    @Override
    public String toString(){
        return this.outputFormatter();
    }
}
    
