package edu.craptocraft.fastbreaktruck.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.types.Cereales;

public class Smiggles extends Cereales {

    private final String NOMBRE = "Smiggles";
    private final Float pvp = 50f;

    public Smiggles(){};

    @Override
    public String nombre(){
        return NOMBRE;
    }

    @Override
    public Float pvp(){
        return pvp;
    }
    
}
