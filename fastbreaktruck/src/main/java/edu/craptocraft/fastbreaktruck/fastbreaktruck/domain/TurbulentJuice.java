package edu.craptocraft.fastbreaktruck.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.types.Bebida;

public class TurbulentJuice extends Bebida{

    private final String NOMBRE = "Turbulent Juice";
    private final Float PVP = 30f;

    public TurbulentJuice(){};

    @Override
    public String nombre(){
        return NOMBRE;
    }

    @Override
    public Float pvp(){
        return PVP;
    }
    
}
