package edu.craptocraft.fastbreaktruck.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.Packing;

public class Tubo implements Packing {

    public Tubo(){};

    @Override
    public String envoltorio(){
        return "tubo";
    }
    
}
