import lib.geometry.Vector;
import gui.MainPanel;
import gui.MainWindow;

public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow("Test", new Vector(800, 600), new MainPanel());
        mainWindow.setFullScreen();
        mainWindow.open();
    }

}
