package edu.craptocraft.fastbreaktruck.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.types.Cereales;

public class Plumbus extends Cereales{

    private final String NOMBRE = "Plumbus";
    private final Float PVP = 100f;

    public Plumbus(){};

    @Override
    public String nombre(){
        return NOMBRE;
    }

    @Override
    public Float pvp(){
        return PVP;
    }
    
}
