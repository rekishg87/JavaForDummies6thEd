package chapters.chapter16.examples;

import javax.swing.JApplet;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rekish on 8/18/2015.
 */
public class Odometer extends JApplet
                                implements ActionListener {
    private static final long serialVersionUID = 1L;

    Timer timer;

    public void init() {
        OdometerPanel panel = new OdometerPanel();

        panel.setBackground(Color.white);
        setContentPane(panel);
    }

    public void start() {
        if (timer == null) {
            timer = new Timer(100, this);
            timer.start();
        } else {
            timer.restart();
        }
    }

    public void stop() {
        if (timer != null) {
            timer.stop();
            timer = null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
