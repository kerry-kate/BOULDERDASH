package controller;

import contract.IBoulderDashModel;
import contract.IBoulderDashView;
import contract.IMap;
import contract.IMobile;

import javax.swing.*;

public class Controllermock implements IBoulderDashView, IBoulderDashModel {

    @Override
    public IMobile getPlayer() {
        return null;
    }

    @Override
    public IMap getMap() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public void setLabels(JLabel[][] labels) {

    }
}
