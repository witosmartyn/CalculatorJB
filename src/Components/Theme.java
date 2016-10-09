package Components;

import javax.swing.*;

public class Theme {
    public static final String theme1 = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";
    public static final String theme2 = "com.jtattoo.plaf.noire.NoireLookAndFeel";
    public static final String theme3 = "com.jtattoo.plaf.smart.SmartLookAndFeel";
    public static final String theme4 = "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";
    public static final String theme5 = "com.jtattoo.plaf.fast.FastLookAndFeel";
    public static final String theme6 = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
    public static final String theme7 = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";
    public static final String theme8 = "com.jtattoo.plaf.luna.LunaLookAndFeel";
    public static final String theme9 = "com.jtattoo.plaf.texture.TextureLookAndFeel";
    public static final String theme10 = "com.jtattoo.plaf.mint.MintLookAndFeel";
    public static  JFrame frame;
//    public static final String theme="theme";
    public static int i =0;

    public Theme(JFrame frame) {
        this.frame= frame;
        select(theme4);
        SwingUtilities.updateComponentTreeUI(frame);
    }



    public  void setTheme(JFrame frame) {
        this.frame= frame;
        i++;
        if (i==10){i=1;}
         switch (i){
             case 1: select(theme1);
                 break;
             case 2: select(theme2);
                 break;
             case 3: select(theme3);
                 break;
             case 4: select(theme4);
                 break;
             case 5: select(theme5);
                 break;
             case 6: select(theme6);
                 break;
             case 7: select(theme7);
                 break;
             case 8: select(theme8);
                 break;
             case 9: select(theme9);
                 break;
             case 10: select(theme10);
                 break;
         }

        SwingUtilities.updateComponentTreeUI(frame);

    }

    public static void select(String s) {
        try {
            UIManager.setLookAndFeel(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }


}
