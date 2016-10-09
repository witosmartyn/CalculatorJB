package Listeners;

import Components.MyTextField;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {

    private JTextField tf;

    public MyMouseListener(JTextField tf) {
        this.tf = tf;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (tf.getText().equals(MyTextField.ENTER_DIGITS)) {
            tf.setText("");
        }
    }
}
