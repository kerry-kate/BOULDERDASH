
package model.allElements;
import java.awt.image.BufferedImage;

import model.allElements.Element;
import model.allElements.Permeability;
import model.allElements.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElementTest {

    private Element element;

    @BeforeEach
    void setUp() {
        Sprite sprite = new Sprite(new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB));
        Permeability permeability = Permeability.PENETRABLE;
        element = new Element(sprite, permeability);
    }

    @Test
    void getSprite() {
        Sprite sprite = element.getSprite();
        assertNotNull(sprite, "Sprite ne doit pas etre null.");

    }

    @Test
    void getPermeability() {
        Permeability permeability = element.getPermeability();
        assertEquals(Permeability.PENETRABLE, permeability,"ca doit etre pernetrable");
    }

    @Test
    void setSprite() {
        Sprite newSprite = new Sprite(new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB));
        element.setSprite(newSprite);
        assertEquals(newSprite, element.getSprite(), "Sprite should be set to the new sprite.");
    }

    @Test
    void setPermeability() {
        Permeability newPermeability = Permeability.BLOCKING;
        element.setPermeability(newPermeability);
        assertEquals(newPermeability, element.getPermeability(), "Permeability ne doit pas etre nul");
    }
}