package edu.craptocraft.behaviour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.fastbreaktruck.fastbreaktruck.behaviour.FastBreakTruck;
import edu.craptocraft.fastbreaktruck.fastbreaktruck.domain.Desayuno;

public class FastBreakTruckTest {


        @Test
        public void testEyesHoles(){

            Desayuno desayuno = FastBreakTruck.prepararEyeHoles();

            assertEquals(2,desayuno.getItems().size());
            assertEquals(false,desayuno.getItems().isEmpty());
        }

        @Test
        public void testSmiggles(){

            Desayuno desayuno = FastBreakTruck.prepararSmiggles();

            assertEquals(2, desayuno.getItems().size());
            assertEquals(false, desayuno.getItems().isEmpty());
        }

        @Test
        public void testPlumbusIncluido(){

            Desayuno desayuno = FastBreakTruck.prepararEyeHoles();
            FastBreakTruck.incluirJuguete(desayuno);

            assertEquals(3, desayuno.getItems().size());
            assertEquals(false, desayuno.getItems().isEmpty());

        }
}



