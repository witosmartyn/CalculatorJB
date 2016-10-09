package Components;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(String name, int height, int widh) {
        super.setSize(widh, height);
        super.setName(name);
//        super.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.magenta));
//        super.setBorder(BorderFactory.createRaisedSoftBevelBorder());
//        super.setBorder(BorderFactory.createRaisedBevelBorder());
        super.setBorder(BorderFactory.createLoweredBevelBorder());
//        super.setBorder(BorderFactory.createTitledBorder("This " + name));
//        super.setBorder(BorderFactory.createSoftBevelBorder(0,Color.red,Color.green,Color.cyan,Color.yellow));

    }

    public MyPanel(String name, int height, int widh, Component... comp) {
        this(name, height, widh);
        for (Component c : comp) {
            super.add(c);

        }
    }

    public MyPanel(String name, int height, int widh, LayoutManager layout, Component... comp) {
        this(name, height, widh);
        super.setLayout(layout);
        for (Component c : comp) {
            super.add(c);
        }


    }

    public MyPanel(String name, int height, int widh, LayoutManager layout) {
        this(name, height, widh);
        super.setLayout(layout);
    }
}