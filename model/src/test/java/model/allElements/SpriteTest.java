package model.allElements;

import model.allElements.staticElem.*;
import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class SpriteTest {

    @Test
    public void testLoadSprite() {

        Sprite sprite = new Sprite(3, 0, "D:\\ucac\\boulderdash_8 new\\mapSprites.png");
        // la on a inscrit un file quelconque qu'on peut remplacer apres par le file voulu
        BufferedImage image = sprite.loadSprite();
        assertNotNull(image, "L'image ne doit pas être nulle.");
        // la on a des largeurs et longueurs quelconques qu'on va remplacer avec la longuer et largeur voulu
        int width = 16;
        int height = 16;
        assertEquals(width, image.getWidth(), "La largeur doit être égale.");
        assertEquals(height, image.getHeight(), "La hauteur doit être égale.");
    }

    @Test
    public void testGetSymbol() {
        Sprite sprite = new Sprite(3, 0, "D:\\ucac\\boulderdash_8 new\\mapSprites.png");
        BufferedImage symbol = sprite.getSymbol();
        assertNotNull(symbol, "Le symbole du sprite ne doit pas être nul.");
        int width = 16;
        int height = 16;
        assertEquals(width, symbol.getWidth(), "La largeur doit être égale.");
        assertEquals(height, symbol.getHeight(), "La hauteur doit être égale.");
    }
}