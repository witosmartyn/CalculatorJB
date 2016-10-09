package Components;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {


    public MyFrame(String title, int widh, int heigt, LayoutManager lm, JPanel p1,
                   JPanel p2, JPanel p3) throws HeadlessException {
        super(title);
        getContentPane().add(p1);
        getContentPane().add(p2);
        getContentPane().add(p3);
        super.setLayout(lm);
        super.setMinimumSize(new Dimension(500, 200));
        super.setSize(widh, heigt);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setVisible(true);
        super.repaint();
    }

}

