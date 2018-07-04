package lib.gui;

import lib.geometry.Vector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by stratosphr on 04/07/2018.
 */
public abstract class AWindow extends JFrame {

    private Vector position;
    private Vector dimension;

    @SuppressWarnings("WeakerAccess")
    public AWindow(String title, Vector dimension, Container mainContainer) {
        super(title);
        this.setPreferredSize(new Dimension(dimension.getWidth(), dimension.getHeight()));
        pack();
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }
        });
        setContentPane(mainContainer);
    }

    public final Vector getPosition() {
        return new Vector(getLocation().x, getLocation().y);
    }

    public final Vector getDimension() {
        return new Vector(getSize().width, getSize().height);
    }

    public final void open() {
        setVisible(true);
    }

    public final void minimize() {
        dispose();
        setUndecorated(false);
        setExtendedState(JFrame.ICONIFIED);
        open();
    }

    public final void maximize() {
        dispose();
        setUndecorated(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        open();
    }

    public final void setFullScreen() {
        dispose();
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("WeakerAccess")
    public final void close() {
        onClose();
    }

    protected abstract void onClose();

}
