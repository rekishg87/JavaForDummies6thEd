package chapters.chapter04.examples;

import javax.swing.JFrame;

/**
 * Created by Rekish on 8/13/2015.
 */
class ShowAFrame {

    public static void main(String args[]) {
        JFrame myFrame = new JFrame();
        String myTitle = "Blank Frame";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
