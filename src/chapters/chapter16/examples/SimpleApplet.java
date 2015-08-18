package chapters.chapter16.examples;

import javax.swing.*;

/**
 * Created by Rekish on 8/18/2015.
 */
public class SimpleApplet extends JApplet {
    public static final long serialVersionUID = 1L;

    public void init() {
        setContentPane(new DummiesPanel());
    }
}
