package model.allElements;

import contract.ISprite;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * <h1> The Class Sprite. </h1>
 *
 * @author Group 8
 */
public class Sprite implements ISprite, Icon {

    /** The constants x,y. */
    private  int x, y;

    /** The variable file. */
    private String file;

    /** The variable symbol. */
    private BufferedImage Symbol;

    /**
     * Instantiates a new Sprite
     * @param x
     *  the x
     * @param y
     *  the y
     * @param file
     *  the file
     */
    public Sprite(int x, int y, String file){
        this.x = x;
        this.y = y;
        this.file = file;
        this.Symbol = loadSprite();
    }

    public Sprite(BufferedImage bufferedImage) {
    }

    //public Sprite(BufferedImage bufferedImage) {
  //  }

    /**
     * Loads sprite
     * @return the sprite
     */
    public BufferedImage loadSprite(){
        //System.out.println("file : " + this.file);
        return SpriteSheetCutter.getSprite(this.x, this.y, this.file);
    }

    /**
     * Gets symbol
     * @return the symbol
     */
    public BufferedImage getSymbol() {
        return Symbol;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
