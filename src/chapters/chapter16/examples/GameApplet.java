package chapters.chapter16.examples;

import javax.swing.JApplet;

/**
 * Created by Rekish on 8/18/2015.
 */
public class GameApplet extends JApplet {
    private static final long serialVersionUID = 1L;

    public void init() {
        setContentPane(new GamePanel());
    }
}
