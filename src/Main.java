import Components.MyTextField;
import Components.Theme;
import Listeners.KeyListener;
import Listeners.MyMouseListener;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static JPanel panel1, panel2, panel3;
    private static JFrame frame;
    private static JLabel lableA, lableB, lableR;
    private static JTextField tfA, tfB, tfR;
    private static JButton bPlus, bMinus, bDevide, bMultiply, chSkin;
    private static GridLayout GL;
    private static FlowLayout FL1;
    private static FlowLayout FL2;
    private static FlowLayout FL3;
    private static Theme theme;

    public static void main(String[] args) {
        initialButtons();
        addAllListeners();
        initialTextFields();
        initialLables();
        initialLayoutManagers();
        initialContainers();
        initialTheme();
    }

    private static void initialTheme() {
        theme = new Theme(frame);
    }

    private static void initialButtons() {

        bPlus = new Components.MyButton("+", "сложить");
        bMinus = new Components.MyButton("-", "отнять");
        bDevide = new Components.MyButton("/", "разделить");
        bMultiply = new Components.MyButton("*", "умножить");
        chSkin = new Components.MyButton("сменить скин", "сменить скин");
    }

    private static void addAllListeners() {
        bPlus.addActionListener(e ->tfR.setText(String.valueOf(Calculate.plus(getA(), getB()))));
        bMinus.addActionListener(e -> tfR.setText(String.valueOf(Calculate.minus(getA(), getB()))));
        bDevide.addActionListener(e -> tfR.setText(String.valueOf(Calculate.devide(getA(), getB()))));
        bMultiply.addActionListener(e -> tfR.setText(String.valueOf(Calculate.mult(getA(), getB()))));

        chSkin.addActionListener(e -> theme.setTheme(frame));
    }

    private static void initialLayoutManagers() {
        GL = new GridLayout(3, 0, 5, 5);
        FL1 = new FlowLayout();
        FL2 = new FlowLayout();
        FL3 = new FlowLayout(FlowLayout.LEFT);
    }

    private static void initialContainers() {
        panel1 = new Components.MyPanel("panel1", 200, 200, FL1, lableA, tfA, lableB, tfB);
        panel2 = new Components.MyPanel("panel2", 200, 200, FL2, bPlus, bMinus, bDevide, bMultiply);
        panel3 = new Components.MyPanel("panel3", 200, 200, FL3, lableR, tfR, chSkin);
        frame = new Components.MyFrame("Калькулятор", 500, 200, GL, panel1, panel2, panel3);
    }

    private static void initialLables() {
        lableA = new JLabel("Число1");
        lableB = new JLabel("Число2");
        lableR = new JLabel("Результат");
    }

    private static void initialTextFields() {

        tfA = new Components.MyTextField(10);
        tfA.addKeyListener(new KeyListener());
        tfA.addMouseListener(new MyMouseListener(tfA));


        tfB = new Components.MyTextField(10);
        tfB.addKeyListener(new KeyListener());
        tfB.addMouseListener(new MyMouseListener(tfB));

        tfR = new Components.MyTextField(15, Color.red);

    }

    public static double getA() {
        String s = tfA.getText();
        double d = 0;
        if (!s.isEmpty()) {
            try {
                d = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                tfA.setText(MyTextField.ENTER_DIGITS);
            }
        }
        return d;
    }

    public static double getB() {
        String s = tfB.getText();
        double d = 0;
        if (!s.isEmpty()) {
            try {
                d = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                tfB.setText(MyTextField.ENTER_DIGITS);
            }
        }
        return d;
    }


}


