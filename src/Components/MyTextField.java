package Components;

import javax.swing.*;
import java.awt.*;


public class MyTextField extends JTextField {
    public static final String ENTER_DIGITS = "Введите число";

//    public MyTextField(String text, int columns) {
//        setColumns(columns);
//        super.setText(text);
//    }

    public MyTextField(int columns) {
        setColumns(columns);
        super.setFont(new Font("Courier", Font.ITALIC, 18));
        super.setForeground(Color.BLACK);
        super.setToolTipText(ENTER_DIGITS);
        super.setText(ENTER_DIGITS);

    }

    public MyTextField(int columns, Color textColor) {
        setColumns(columns);
        super.setFont(new Font("Courier", Font.ITALIC, 20));
        super.setForeground(textColor);
        super.setEditable(false);
    }


}
