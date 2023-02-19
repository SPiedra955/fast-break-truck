package edu.craptocraft.fastbreaktruck.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public class Caja implements Packing {

    public Caja(){};

    @Override
    public String envoltorio(){
        return "caja";
    }
    
}
