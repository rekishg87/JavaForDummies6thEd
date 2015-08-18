package chapters.chapter15.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Rekish on 8/18/2015.
 */
public class GameFrame2 extends JFrame {
    private static final long serialVersionUID = 1L;

    int randomNumber = new Random().nextInt(10) + 1;
    int numGuesses = 0;

    JTextField textField = new JTextField(5);
    JButton jButton = new JButton("Guess");
    JLabel jLabel = new JLabel(numGuesses + " guesses");

    public GameFrame2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(jButton);
        add(jLabel);
        jButton.addActionListener(new MyActionListener());
        pack();
        setVisible(true);
    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String textFieldText = textField.getText();

            if (Integer.parseInt(textFieldText) == randomNumber) {
                jButton.setEnabled(false);
                textField.setText(textField.getText() + " Yes!");
                textField.setEnabled(false);
            } else {
                textField.setText("");
                textField.requestFocus();
            }

            numGuesses++;
            String guessWord =
                    (numGuesses == 1) ? " guess" : " guesses";
            jLabel.setText(numGuesses + guessWord);
        }
    }
}
