package view;

import contract.IMap;
import contract.IMobile;
import contract.ISprite;

import javax.lang.model.element.Element;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Observable;

public class mock implements IMap,IMobile ,ISprite {


    @Override
    public void moveUp() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public ISprite getSprite() {

        ISprite sprite = null;
        return sprite;
    }


    @Override
    public int getWidth() {
        int Width = 0;
        return Width;
    }

    @Override
    public int getHeight() {
        int Height = 0;
        return Height;
    }

    @Override
    public Element[][] getOnTheMapXY(int x, int y) {
        return new Element[0][0];
    }

    @Override
    public void setMobileHasChanged() {

    }

    @Override
    public Observable getObservable() {
        return null;
    }

    @Override
    public BufferedImage[][] getSymbolonTheMap() {
        return new BufferedImage[0][];
    }

    @Override
    public IMobile getPlayer() {
        IMobile Player = null;
        return Player;
    }

    @Override
    public Point getPosition() {
        Point Position = null;
        return Position;
    }

    @Override
    public void setPosition(Point point) {

    }



    @Override
    public BufferedImage getSymbol() {
        BufferedImage Symbol = null;
        return Symbol;
    }
}
