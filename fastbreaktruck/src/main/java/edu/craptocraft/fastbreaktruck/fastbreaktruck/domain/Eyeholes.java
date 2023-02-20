package edu.craptocraft.fastbreaktruck.fastbreaktruck.domain;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.types.*;;

public class Eyeholes extends Cereales {

    private final String NOMBRE = "EyeHoles";
    private final Float pvp = 25f;

    public Eyeholes(){};

    @Override
    public String nombre(){
        return NOMBRE;
    }

    @Override
    public  Float pvp(){
        return pvp;
    }
    
}
