package model;


import contract.IBoulderDashModel;
import model.allElements.mobileElem.Player;

import java.io.IOException;

/**
 * <h1> The Class Boulder Dash Model</h1>
 *
 * @author Group 8
 */

public class BoulderDashModel implements IBoulderDashModel {

    /** The map. */
    private static Map map;

    /** The myHero. */
    private static Player myHero;

    /**
     * Constructor
     * @param file
     *          name of th file
     */
    public BoulderDashModel(final String file) throws IOException{
        this.setMap(new Map(file));
    }

    public static Map getMap(){
        return map;
    }

    /**
     * Sets the map.
     *
     * @param map
     * the map to set
     */
    void setMap(final Map map){
        this.map = map;
    }

    public static Player getMyHero(){
        return myHero;
    }

    /**
     * Sets the my hero.
     *
     * @param myHero
     * the myHero to set
     */
    void setMyHero(final Player myHero){
        this.myHero=myHero;
    }

}
