package Components;

import javax.swing.*;
import java.awt.*;

public class MyJDialog extends JDialog {
    public MyJDialog(String title, int widh, int height) {
        super.setName(title);
        super.setSize(widh, height);
        super.setLocationRelativeTo(null);
        super.setVisible(true);
        super.setLayout(new FlowLayout());
        super.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
}

