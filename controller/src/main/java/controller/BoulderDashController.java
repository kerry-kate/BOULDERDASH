package controller;


import contract.IBoulderDashController;
import contract.IBoulderDashModel;
import contract.IBoulderDashView;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.text.View;
import java.io.File;
import java.io.IOException;

/**
 * <h1>The Class Boulder Dash Controller</h1>
 */
public class BoulderDashController implements IBoulderDashController {

    /** The boulder view */
    private IBoulderDashView boulderDashView;

    /** The boulder model. */
    private IBoulderDashModel boulderDashModel;

    /**
     * Instantiates a new Boulder Dash Controller.
     * @param view
     * the view
     * @param model
     * the model
     */
    public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
        this.setView(view);
        this.setModel(model);
    }

    public IBoulderDashModel getBoulderDashModel() {
        return boulderDashModel;
    }

    /**
     *
     * @param model
     * sets the model
     */
    void setModel(IBoulderDashModel model) {
        this.boulderDashModel = model;
    }

    public IBoulderDashView getBoulderDashView() {
        return boulderDashView;
    }

    /**
     *
     * @param view
     * sets view
     */
    void setView(IBoulderDashView view) {
        this.boulderDashView = view;
    }

    public void play() throws IOException, InterruptedException {
        this.boulderDashView.runView();
    }
    public static void music(){
        try{
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream((new File("Dragon-ball-Z-soundtrack-3.wav")));
            Clip gamemusic = AudioSystem.getClip();
            gamemusic.open(audioInputStream);
            gamemusic.loop(Clip.LOOP_CONTINUOUSLY);
            gamemusic.start();

        } catch (Exception ex){
            ex.printStackTrace();
        }


    }


}

    