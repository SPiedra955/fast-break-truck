package edu.craptocraft.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Eyeholes;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.FleebJuice;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Plumbus;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Smiggles;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.TurbulentJuice;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.types.Bebida;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.types.Cereales;

public class DomainTest {

    @Test
    public void eyesHolesValues(){
        Cereales eyesHoles = new Eyeholes();

        assertEquals("EyeHoles", eyesHoles.nombre());
        Assert(25f, eyesHoles.pvp());
        assertEquals("caja", eyesHoles.empaquetado().envoltorio());
    }
        private void Assert(float f, Float pvp) {
    }

    @Test
    public void smigglesValues(){
        Cereales smiggles = new Smiggles();

        assertEquals("Smiggles", smiggles.nombre());
        assertEquals("caja", smiggles.empaquetado().envoltorio());
        Assert(50f, smiggles.pvp());
    }

    @Test
    public void fleebJuiceValues(){
        Bebida bebida = new FleebJuice();
        
        assertEquals("Fleeb Juice", bebida.nombre());
        assertEquals("tubo", bebida.empaquetado().envoltorio());
        Assert(35f, bebida.pvp());
    }

    @Test
    public void turbulentJuiceValues(){
        Bebida bebida = new TurbulentJuice();
        
        assertEquals("Turbulent Juice", bebida.nombre());
        assertEquals("tubo", bebida.empaquetado().envoltorio());
        Assert(35f, bebida.pvp());
    }

    @Test
    public void plumbusValues(){
        Cereales juguete = new Plumbus();

        assertEquals("Plumbus", juguete.nombre());
        assertEquals("caja", juguete.empaquetado().envoltorio());
        Assert(100f, juguete.pvp());
    }


    
}
