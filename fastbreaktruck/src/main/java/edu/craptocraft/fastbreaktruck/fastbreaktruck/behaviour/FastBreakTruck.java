package edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Desayuno;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Eyeholes;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.FleebJuice;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Plumbus;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Smiggles;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.TurbulentJuice;

public class FastBreakTruck {

    public FastBreakTruck(){};

    public static Desayuno prepararEyeHoles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new TurbulentJuice());
        desayuno.addItem(new Plumbus());
        return desayuno;
    }

    public static Desayuno prepararSmiggles(){
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleebJuice());
        return desayuno;
    }

    public static void incluirJuguete(Desayuno desayuno){
        desayuno.addItem(new Plumbus());
    }

}
