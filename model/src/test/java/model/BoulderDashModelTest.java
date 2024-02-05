package model;

import static org.junit.jupiter.api.Assertions.*;

import model.allElements.mobileElem.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoulderDashModelTest {

    private BoulderDashModel boulderDashModel;
    Map map;
    Player myhero;

    @Test
    void testGetMap() {
        Map testmap = boulderDashModel.getMap();
        Assertions.assertEquals(map, testmap);
    }

    @Test
    void testGetMyHero() {
       Player hero = boulderDashModel.getMyHero();
        Assertions.assertEquals(myhero, hero);

    }



}
