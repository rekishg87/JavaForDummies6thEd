package chapters.chapter15.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Rekish on 8/18/2015.
 */
public class MoneyFrame extends JFrame implements
        KeyListener, ItemListener, MouseListener {
    private static final long serialVersionUID = 1L;

    JLabel fromCurrencyLabel = new JLabel(" ");
    JTextField textField = new JTextField(5);
    JLabel label = new JLabel("           ");
    JComboBox<String> combo = new JComboBox<>();
    NumberFormat currencyUS =
            NumberFormat.getCurrencyInstance();
    NumberFormat currencyUK =
            NumberFormat.getCurrencyInstance(Locale.UK);

    public MoneyFrame() {
        setLayout(new FlowLayout());

        add(fromCurrencyLabel);
        add(textField);
        combo.addItem("US to UK");
        combo.addItem("UK to US");
        add(label);
        add(combo);

        textField.addKeyListener(this);
        combo.addItemListener(this);
        label.addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 100);
        setVisible(true);
    }

    void setTextOnLabel() {
        String amountString = "";
        String fromCurrency = "";

        try {
            double ammount =
                    Double.parseDouble(textField.getText());

            if (combo.getSelectedItem().equals("US to UK")) {
                amountString = " = "
                        + currencyUK.format(ammount * 0.61214);
                fromCurrency = "$";
            }
            if (combo.getSelectedItem().equals("UK to US")) {
                amountString = " = "
                        + currencyUS.format(ammount * 1.63361);
                fromCurrency = "\u00A3";
            }
        } catch (NumberFormatException e) {

        }

        label.setText(amountString);
        fromCurrencyLabel.setText(fromCurrency);
    }

    @Override
    public void itemStateChanged(ItemEvent i) {
        setTextOnLabel();
    }

    @Override
    public void keyTyped(KeyEvent k) {

    }

    @Override
    public void keyPressed(KeyEvent k) {

    }

    @Override
    public void keyReleased(KeyEvent k) {
        setTextOnLabel();
    }

    @Override
    public void mouseClicked(MouseEvent m) {

    }

    @Override
    public void mousePressed(MouseEvent m) {

    }

    @Override
    public void mouseReleased(MouseEvent m) {

    }

    @Override
    public void mouseEntered(MouseEvent m) {
        label.setForeground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent m) {
        label.setForeground(Color.black);
    }
}
