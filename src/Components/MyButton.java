package Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {



    public MyButton(String title,String ttText) {
        super.setText(title);
        setPreferredSize(new Dimension(100,30));
        super.setToolTipText(ttText);
    }

    public MyButton(String title, int width, int height) {
        this.setText(title);
        setPreferredSize(new Dimension(width, height));
    }

    public MyButton(String title, ActionListener aL) {
        super.addActionListener(aL);
        this.setText(title);
    }

}
