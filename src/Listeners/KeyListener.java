package Listeners;

import java.awt.event.KeyAdapter;
public class KeyListener extends KeyAdapter {
    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        char a = e.getKeyChar();
        if (!Character.isDigit(a)) {
            if (a != '.') {
                e.consume();//игнорирует все остальное
            }
        }
    }
}


