
package model.allElements;

import model.allElements.Permeability;
import model.allElements.Sprite;
import model.allElements.mobileElem.MobileElem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

    class MobileElemTest {

        private MobileElem mobileElem;

        @BeforeEach
        void setUp() {
            Sprite sprite = new Sprite(null); // Remplacons null par une instance valide de BufferedImage
            Permeability permeability = Permeability.PENETRABLE;
            mobileElem = new MobileElem(sprite, permeability, 0, 0);
        }

        @Test
        void moveUp() {
            int initialY = mobileElem.getY();
            mobileElem.moveUp();
            assertEquals(initialY - 1, mobileElem.getY(), "initialY - 1 = mobileElem.getY() apres move up .");
        }

        @Test
        void moveLeft() {
            int initialX = mobileElem.getX();
            mobileElem.moveLeft();
            assertEquals(initialX - 1, mobileElem.getX(), "initialX - 1 = mobileElem.getX() apres move left.");
        }

        @Test
        void moveDown() {
            int initialY = mobileElem.getY();
            mobileElem.moveDown();
            assertEquals(initialY + 1, mobileElem.getY(), "initialY + 1 = mobileElem.getY() apres move down");
        }

        @Test
        void moveRight() {
            int initialX = mobileElem.getX();
            mobileElem.moveRight();
            assertEquals(initialX + 1, mobileElem.getX(), "initialX + 1 = mobileElem.getX() apres move right.");
        }

        @Test
        void getX() {
            mobileElem.setPosition(new Point(5, 10));
            assertEquals(5, mobileElem.getX(), "X = 5.");
        }

        @Test
        void setX() {
            mobileElem.setX(15);
            assertEquals(15, mobileElem.getX(), "X = 15.");
        }

        @Test
        void getY() {
            mobileElem.setPosition(new Point(5, 10));
            assertEquals(10, mobileElem.getY(), "Y = 10.");
        }

        @Test
        void getPosition() {
            Point position = new Point(5, 10);
            mobileElem.setPosition(position);
            assertEquals(position, mobileElem.getPosition(), " le position actuelle doit etre egale a la position entre.");
        }

        @Test
        void setPosition() {
            Point newPosition = new Point(15, 20);
            mobileElem.setPosition(newPosition);
            assertEquals(newPosition, mobileElem.getPosition(), "Position = newPosition.");
        }

        @Test
        void setY() {
            mobileElem.setY(20);
            assertEquals(20, mobileElem.getY(), "Y = 20.");
        }
    }