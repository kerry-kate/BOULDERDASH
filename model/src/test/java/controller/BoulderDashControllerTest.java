package controller;


import contract.IBoulderDashModel;
import contract.IBoulderDashView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class BoulderDashControllerTest {

    private IBoulderDashView boulderDashView;
    private IBoulderDashModel boulderDashModel;
    private BoulderDashController controller;

    @BeforeEach
    void setUp() {
        boulderDashView = new Controllermock();
        boulderDashModel = new Controllermock();
        controller = new BoulderDashController(boulderDashView, boulderDashModel);
        controller.setModel(boulderDashModel);
        controller.setView(boulderDashView);
    }

    @Test
    void getBoulderDashModel() {
        IBoulderDashModel Model = controller.getBoulderDashModel();
        assertEquals(boulderDashModel,Model);
    }



    @Test
    void getBoulderDashView() {
        IBoulderDashView View  = controller.getBoulderDashView();
        assertEquals(boulderDashView,View);
    }



    @Test
    void play() {
        assertDoesNotThrow(() -> {
            controller.play();
        }, "on lance sans exception.");
    }

}