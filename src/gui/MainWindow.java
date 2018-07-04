package gui;

import lib.geometry.Vector;
import lib.gui.AWindow;

import java.awt.*;

/**
 * Created by stratosphr on 04/07/2018.
 */
public class MainWindow extends AWindow {

    public MainWindow(String title, Vector dimension, Container mainContainer) {
        super(title, dimension, mainContainer);
    }

    @Override
    protected void onClose() {
        System.exit(0);
    }

}
