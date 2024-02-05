package model;

import model.allElements.mobileElem.Monster;
import model.allElements.mobileElem.Player;
import model.allElements.staticElem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MapTest {

    private Map map;

    @BeforeEach
    void setUp() {
        try {
            map = new Map("chemin/vers/le/fichier/map.txt"); // on entre le chemin vers le fichier
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testGetWidth() {
        int expectedWidth = 10;
        assertEquals(expectedWidth, map.getWidth());
    }

    @Test
    void testGetHeight() {
        int expectedHeight = 10;
        assertEquals(expectedHeight, map.getHeight());
    }

    @Test
    void testGetPlayer() {
        Player player = map.getPlayer();
        assertNotNull(player);

    }

    @Test
    void testGetSymbolonTheMap() {
        BufferedImage[][] symbolOnTheMap = map.getSymbolonTheMap();
        assertNotNull(symbolOnTheMap);

    }

}

